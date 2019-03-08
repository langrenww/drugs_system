package com.jk.service;


import com.jk.pojo.SupplierDrug;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface SupplierApi {
    @GetMapping
   List<SupplierDrug> SupperDrugFind(@RequestParam("supplierId") Integer supplierId);
}
