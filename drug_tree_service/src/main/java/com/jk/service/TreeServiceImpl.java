package com.jk.service;

import com.jk.dao.ITreeDao;
import com.jk.pojo.ShoppingCart;
import com.jk.pojo.Tree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Service
public class TreeServiceImpl implements ITreeService {

    @Autowired
    private ITreeDao treeDao;

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    public List<Tree> queryTreeAll() {
        int pid = 0;
        List<Tree> list = findNodes(pid);
        return list;
    }

    @Override
    public void saveDrugToRedis(ShoppingCart shoppingCart) {

        //查询药品
        ShoppingCart shoppingCarts = treeDao.queryDrugById(shoppingCart.getDrugId());
        shoppingCarts.setUserId(shoppingCart.getUserId());
        shoppingCarts.setDrugNumber(1);

        //获取该用户的redis数据
        List<ShoppingCart> queryShoppingCartList = (List<ShoppingCart>) redisTemplate.opsForValue().get(shoppingCarts.getUserId());
        //创建一个新的数组 用于存入新的数据
        List<ShoppingCart> shoppingCartList = new ArrayList<>();

        //判断查询的数组是否为空
        if (queryShoppingCartList != null) {
            //进入判断 redis有数据
            //遍历数组 将查询出来的数据存入新的数组中
            for (int i = 0; i < queryShoppingCartList.size(); i++) {
                shoppingCartList.add(queryShoppingCartList.get(i));
            }

            //删除redis中的数据
            redisTemplate.delete(shoppingCarts.getUserId());
        }

        //将查询出来的数据加入的新的数组中
        shoppingCartList.add(shoppingCarts);

        //将该用户的数据添加进去
        redisTemplate.opsForValue().set(shoppingCarts.getUserId(), shoppingCartList);

        //设置失效时间
        redisTemplate.expire(shoppingCarts.getUserId(), 3, TimeUnit.MINUTES);

        //输出查询的数据
        List<ShoppingCart> newList = (List<ShoppingCart>) redisTemplate.opsForValue().get(shoppingCarts.getUserId());
        for (ShoppingCart shoppingCart1 : newList) {
            System.out.println(shoppingCart1.toString());
        }
    }

    @Override
    public List<ShoppingCart> queryShoppingCart(ShoppingCart shoppingCart) {
        //从redis查询数据
        List<ShoppingCart> newList = (List<ShoppingCart>) redisTemplate.opsForValue().get(shoppingCart.getUserId());
        return newList;
    }

    @Override
    public void updateDrugNumber(ShoppingCart shoppingCart) {
        List<ShoppingCart> newList = (List<ShoppingCart>) redisTemplate.opsForValue().get(shoppingCart.getUserId());
        System.out.println(shoppingCart.toString());
        //修改价格
        for (int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i).getDrugId() + "," + shoppingCart.getDrugId());
            System.out.println(Integer.toString(newList.get(i).getDrugId() ).equals(Integer.toString(shoppingCart.getDrugId())));
            if (Integer.toString(newList.get(i).getDrugId() ).equals(Integer.toString(shoppingCart.getDrugId()))) {
                newList.get(i).setDrugNumber(shoppingCart.getDrugNumber());
            }
        }

        //删除redis中的数据
        redisTemplate.delete(shoppingCart.getUserId());
        //将该用户的数据添加进去
        redisTemplate.opsForValue().set(shoppingCart.getUserId(), newList);

        //设置失效时间
        redisTemplate.expire(shoppingCart.getUserId(), 3, TimeUnit.MINUTES);

    }


    private List<Tree> findNodes(int pid) {
        List<Tree> list = treeDao.queryTreeAll(pid);
        for (Tree treeBean : list) {
            Integer id = Integer.parseInt(treeBean.getId());
            List<Tree> nodes = findNodes(id);
            if (nodes.size() <= 0) {
                treeBean.setSelectable(true);
            } else {
                treeBean.setSelectable(false);
                treeBean.setNodes(nodes);
            }
        }
        return list;
    }
}
