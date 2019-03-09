package com.jk.service;

import com.jk.pojo.ProductAgency;
import com.jk.pojo.ProductAgencyDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public interface ProductServiceApi {
    @GetMapping
    void frameTest();
    @PostMapping
    String saveAgencyInfo(ProductAgency productAgency);
    @GetMapping("queryAgencyInfo")
    List<ProductAgencyDto> queryAgencyInfo();
}
