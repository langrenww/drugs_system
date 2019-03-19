package com.jk.service;

import com.jk.pojo.ShoppingCart;
import com.jk.pojo.Tree;

import java.util.List;

public interface ITreeService {

    List<Tree> queryTreeAll();

    void saveDrugToRedis(ShoppingCart shoppingCart);

    List<ShoppingCart> queryShoppingCart(ShoppingCart shoppingCart);

    void updateDrugNumber(ShoppingCart shoppingCart);
}
