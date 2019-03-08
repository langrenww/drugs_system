package com.jk.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.jk.pojo.SupplierDrug;
import com.jk.service.CustomerServiceFegin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private CustomerServiceFegin customerService;

    @GetMapping("customerFind")
    @ResponseBody
    public List<SupplierDrug> SupperDrugFind(Integer supplierId){
        supplierId=2;
        return customerService.SupperDrugFind(supplierId);
    }


}
