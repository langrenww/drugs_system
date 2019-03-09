package com.jk.service;

import com.jk.pojo.SupplierDrug;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public interface SupplierApi {
    @GetMapping("supplierFind")
     List<SupplierDrug> SupperDrugFind(@RequestParam("supplierId") Integer supplierId);

    @GetMapping("shoppingFind")
   List<SupplierDrug> ShoppingFind();
}
