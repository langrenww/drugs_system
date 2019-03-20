package com.jk.controller;

import com.jk.pojo.*;
import com.jk.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Controller
@RequestMapping("product")
public class ProductController {
    @Autowired
    private ProductService productService;
    /*@Autowired
    private RedisTemplate<String, Object> redisTemplate;*/

    @GetMapping("frameTest")
    @ResponseBody
    public String frameTest(){
        productService.frameTest();
        System.out.println("已进入到web");
        return null;
    }

    /**
     * 添加代理信息
     * @param productAgency
     * @return
     */
    @PostMapping ("saveAgencyInfo")
    @ResponseBody
    public String saveAgencyInfo(ProductAgency productAgency) {
        System.out.println("@@@@@@@@@@@@"+productAgency.toString());
        String str = productService.saveAgencyInfo(productAgency);
        return str;
    }
    //查询地区代理人和信息
    @GetMapping("queryAgencyInfo")
    @ResponseBody
    public List<ProductAgencyDto> queryAgencyInfo() {

        return productService.queryAgencyInfo();
    }
    //查询地区代理人和信息
    @GetMapping("approveAgencyInfo")
    @ResponseBody
    public List<ProductAgencyDto> approveAgencyInfo() {

        return productService.approveAgencyInfo();
    }

    /**
     * 删除单条代理信息
     * @param id
     * @return
     */
    @DeleteMapping("deleteAgencyInfo")
    @ResponseBody
    public String deleteAgencyInfo(String  id){
       String str= productService.deleteAgencyInfo(id);
        return str;
    }

    /**
     * 查询地区
     * @param pid
     * @return
     */
    @GetMapping  ("toConnect")
    @ResponseBody
    public List<District> toConnect(String pid) {
        System.out.println(pid);
        List<District> map=productService.selectDirect(pid);
        return map ;
    }

    /**
     * 提交企业资质信息
     * @param enterpriseQualificationDetail
     * @return
     */
    @PostMapping("submitAuditInfo")
    @ResponseBody
    public String submitAuditInfo(EnterpriseQualificationDetail enterpriseQualificationDetail) {
        System.out.println("@@@@@@@@@@@@"+enterpriseQualificationDetail.toString());
        String str = productService.submitAuditInfo(enterpriseQualificationDetail);
        return str;
    }

    /**
     * 查询已审核通过的代理信息
     * @param id
     * @return
     */
    @PutMapping("updateAgencyInfo")
    @ResponseBody
    public String updateAgencyInfo(String  id){
        String str= productService.updateAgencyInfo(id);
        return str;
    }





    @GetMapping("queryGoodsById")
    @ResponseBody
    public List<Goods> queryGoodsById(@RequestParam("pid") Integer pid){


        List<Goods> list = new ArrayList<>();
      /*  //1、从缓存中获取树信息
        //2、有：返回
        //3、没有：a、从数据库获取  b、存入缓存
        String rediskey = "navtree"+1;
        Boolean hasKey = redisTemplate.hasKey(rediskey);
        if(hasKey){//存在
            System.out.println("走缓存。。。。");
            list = (List<Goods>) redisTemplate.opsForValue().get(rediskey);
        }else{//不存在
            System.out.println("走数据库。。。。");
            list = productService.queryGoodsById(pid);
            //将数据存入缓存
            redisTemplate.opsForValue().set(rediskey, list);
            //redisTemplate.expire(rediskey, 30, TimeUnit.MINUTES);
            redisTemplate.expire(rediskey, 30, TimeUnit.SECONDS);
        }
*/

        list = productService.queryGoodsById(pid);

        return list;
    }

    @GetMapping("queryNewGoods")
    @ResponseBody
    public List<NewestGoods> queryNewGoods(){

        List<NewestGoods> list= productService.queryNewGoods();

        return list;
    }

    @PostMapping("addSupplyGoods")
    @ResponseBody
    public String addSupplyGoods(ShoppingInfo shoppingInfo){

        productService.addSupplyGoods(shoppingInfo);

        return null;

    }

    @GetMapping("querySupplyGoods")
    @ResponseBody
    public List<ShoppingInfo> querySupplyGoods(){
        List<ShoppingInfo>list=productService.querySupplyGoods();
        return list;
    }


}
