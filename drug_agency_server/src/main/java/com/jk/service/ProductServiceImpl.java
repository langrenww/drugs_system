package com.jk.service;

import com.jk.dao.ProductMapper;
import com.jk.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.reflect.generics.tree.Tree;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public String frameTest() {

        return "已进入到serviceImpl";
    }

    @Override
    public int saveAgencyInfo(ProductAgency productAgency) {
        int i= productMapper.saveAgencyInfo(productAgency);
        return i;
    }

    @Override
    public List<ProductAgencyDto> queryAgencyInfo() {
        return productMapper.queryAgencyInfo();
    }

    @Override
    public int deleteAgencyInfo(String  id) {

        return productMapper.deleteAgencyInfo(id);
    }

    @Override
    public List<District> selectDirect(String pid) {
        return productMapper.selectDirect(pid);
    }

    @Override
    public int submitAuditInfo(EnterpriseQualificationDetail enterpriseQualificationDetail) {
        int i=productMapper.submitAuditInfo(enterpriseQualificationDetail);
        int sum= productMapper.submitAuditInfo2(enterpriseQualificationDetail);
        return sum;
    }

    @Override
    public int updateAgencyInfo(String id) {

        return productMapper.updateAgencyInfo(id);
    }

    @Override
    public List<ProductAgencyDto> approveAgencyInfo() {

        return productMapper.approveAgencyInfo();
    }



    @Override
    public List<Goods> queryGoodsById(Integer pid) {
        List<Goods> goods = productMapper.queryGoodsById(pid);
        for (Goods good : goods) {
            Integer goodsId = good.getId();
            List<Goods> slist=queryGoodsById(goodsId);
            good.setNodes(slist);
        }


        return goods;
    }

    @Override
    public List<NewestGoods> queryNewGoods() {
        return productMapper.queryNewGoods();
    }

    @Override
    public void addSupplyGoods(ShoppingInfo shoppingInfo) {
        productMapper.addSupplyGoods(shoppingInfo);
    }

    @Override
    public List<ShoppingInfo> querySupplyGoods() {

        return productMapper.querySupplyGoods();
    }


}
