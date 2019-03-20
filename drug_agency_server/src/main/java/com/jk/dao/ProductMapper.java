package com.jk.dao;

import com.jk.pojo.*;

import java.util.List;

public interface ProductMapper {
    int saveAgencyInfo(ProductAgency productAgency);

    List<ProductAgencyDto> queryAgencyInfo();

    int deleteAgencyInfo(String  id);

    List<District> selectDirect(String pid);
    int submitAuditInfo(EnterpriseQualificationDetail enterpriseQualificationDetail);
    int submitAuditInfo2(EnterpriseQualificationDetail enterpriseQualificationDetail);

    int updateAgencyInfo(String id);

    List<ProductAgencyDto> approveAgencyInfo();



    List<Goods> queryGoodsById(Integer pid);


    List<NewestGoods> queryNewGoods();

    void addSupplyGoods(ShoppingInfo shoppingInfo);

    List<ShoppingInfo> querySupplyGoods();
}
