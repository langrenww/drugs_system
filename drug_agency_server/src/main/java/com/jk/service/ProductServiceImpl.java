package com.jk.service;

import com.jk.dao.ProductMapper;
import com.jk.pojo.ProductAgency;
import com.jk.pojo.ProductAgencyDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
