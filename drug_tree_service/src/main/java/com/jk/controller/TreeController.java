package com.jk.controller;

import com.jk.pojo.ShoppingCart;
import com.jk.pojo.Tree;
import com.jk.service.ITreeService;
import com.jk.service.ITreeServiceApi;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class TreeController implements ITreeServiceApi {

    @Resource
    private ITreeService treeService;

    @ResponseBody
    public List<Tree> queryTreeAll(){
        System.out.println("进入service");
        return treeService.queryTreeAll();
    }

    @ResponseBody
    public String saveDrugToRedis(@RequestBody ShoppingCart shoppingCart){
          treeService.saveDrugToRedis(shoppingCart);
          return "OK";
    }

    @ResponseBody
    public List<ShoppingCart> queryShoppingCart(@RequestBody ShoppingCart shoppingCart){
            return treeService.queryShoppingCart(shoppingCart);
    }

    @ResponseBody
    public String updateDrugNumber(@RequestBody ShoppingCart shoppingCart){
          treeService.updateDrugNumber(shoppingCart);
          return "OK";
    }

}
