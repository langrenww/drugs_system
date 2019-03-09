package com.jk.service;

import com.jk.pojo.ProductAgency;
import com.jk.pojo.ProductAgencyDto;

import java.util.List;

public interface ProductService {
    String frameTest();

    int saveAgencyInfo(ProductAgency productAgency);

    List<ProductAgencyDto> queryAgencyInfo();
}
