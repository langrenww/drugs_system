package com.jk.controller;

import com.jk.pojo.SupplierDrug;
import com.jk.service.SupplierApi;
import com.jk.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SupplierController implements SupplierApi {
   @Autowired
    private SupplierService supplierService;

   /*
   * 供应商查询药品列表
   * */
   @ResponseBody
    public List<SupplierDrug> SupperDrugFind(@RequestParam("supplierId") Integer supplierId){
    return supplierService.SupperDrugFind(supplierId);
   }



}
