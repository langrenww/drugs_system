package com.jk.service;

import com.jk.pojo.ShoppingCart;
import com.jk.pojo.Tree;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public interface ITreeServiceApi {

    @GetMapping("queryTreeAll")
    List<Tree> queryTreeAll();

    @PostMapping("saveDrugToRedis")
    String saveDrugToRedis(ShoppingCart shoppingCart);

    @PostMapping("queryShoppingCart")
    List<ShoppingCart> queryShoppingCart(ShoppingCart shoppingCart);

    @PostMapping("updateDrugNumber")
    String updateDrugNumber(ShoppingCart shoppingCart);
}
