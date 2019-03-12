package com.jk.dao;

import com.jk.pojo.ProductAgency;
import com.jk.pojo.ProductAgencyDto;

import java.util.List;

public interface ProductMapper {
    int saveAgencyInfo(ProductAgency productAgency);

    List<ProductAgencyDto> queryAgencyInfo();

    int deleteAgencyInfo(String  id);
}
