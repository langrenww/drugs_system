package com.jk.controller;

import com.jk.pojo.ShoppingCart;
import com.jk.pojo.SupplierDrug;
import com.jk.pojo.Tree;
import com.jk.service.ITreeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class TreeController {

    @Resource
    private ITreeService treeService;

    @GetMapping("queryTreeAll")
    @ResponseBody
    public List<Tree> queryTreeAll() {
        List<Tree> treeList = treeService.queryTreeAll();
        System.out.println(treeList);
        return treeList;
    }

    @PostMapping("saveDrugToRedis")
    @ResponseBody
    public String saveDrugToRedis(@RequestBody ShoppingCart shoppingCarts) {
        treeService.saveDrugToRedis(shoppingCarts);
        return "OK";
    }

    @PostMapping("queryShoppingCart")
    @ResponseBody
    public List<ShoppingCart> queryShoppingCart(@RequestBody ShoppingCart shoppingCart) {
        List<ShoppingCart> shoppingCartList = treeService.queryShoppingCart(shoppingCart);
        System.out.println("查询的数据: " + shoppingCartList);
        return shoppingCartList;
    }

    @PostMapping("updateDrugNumber")
    @ResponseBody
    public String updateDrugNumber(@RequestBody ShoppingCart shoppingCart) {
       String str = treeService.updateDrugNumber(shoppingCart);
        return str;
    }



}
