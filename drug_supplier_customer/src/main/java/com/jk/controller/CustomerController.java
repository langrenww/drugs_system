package com.jk.controller;

import com.jk.pojo.SupplierDrug;
import com.jk.service.CustomerServiceFegin;
import com.jk.service.SupplierApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CustomerController{
    @Autowired
    private CustomerServiceFegin customerServiceFegin;
    /*
     * 供应商查询药品列表
     * */
    @GetMapping("SupplierFind")
    @ResponseBody
    public List<SupplierDrug> SupperDrugFind(Integer supplierId){
        supplierId=1;
        return customerServiceFegin.SupperDrugFind(supplierId);
    }

    /*
     * 走供应商查询药品页面
     * */
    @GetMapping("SupplierPage")
    public String SupplierPage(){
     return "supplierShow";
    }
    /*
     * 走购物车查询药品页面
     * */
    @GetMapping("ShoppingPage")
    public String ShoppingPage(){
        return "shoppingShow";
    }
    /*
     * 购物车列表
     * */
    @GetMapping("ShoppingFind")
    @ResponseBody
    public List<SupplierDrug> ShoppingFind(){
        return customerServiceFegin.ShoppingFind();
    }
}
