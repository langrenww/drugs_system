package com.jk.dao;

import com.jk.pojo.ShoppingCart;
import com.jk.pojo.Tree;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ITreeDao {
    List<Tree> queryTreeAll(@Param("pid") int pid);

    ShoppingCart queryDrugById(Integer drugId);
}
