package com.jk.service;

import com.jk.pojo.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface ProductServiceApi {
    @GetMapping
    void frameTest();
    @PostMapping("saveAgencyInfo")
    String saveAgencyInfo(ProductAgency productAgency);
    @GetMapping("queryAgencyInfo")
    List<ProductAgencyDto> queryAgencyInfo();
    @DeleteMapping("deleteAgencyInfo")
    String deleteAgencyInfo(String  id);
    @PostMapping  ("toConnect")
    List<District> selectDirect(@RequestBody  String pid);
    @PostMapping("submitAuditInfo")
    String submitAuditInfo(EnterpriseQualificationDetail enterpriseQualificationDetail);
    @PutMapping("updateAgencyInfo")
    String updateAgencyInfo(@RequestBody String id);
    @GetMapping("approveAgencyInfo")
    List<ProductAgencyDto> approveAgencyInfo();

    @GetMapping  ("queryGoodsById")
    List<Goods> queryGoodsById(@RequestParam("pid") Integer pid);
    @GetMapping("queryNewGoods")
    List<NewestGoods> queryNewGoods();
    @PostMapping("addSupplyGoods")
    void addSupplyGoods(@RequestBody ShoppingInfo shoppingInfo);
    @GetMapping("querySupplyGoods")
    List<ShoppingInfo> querySupplyGoods();
}
