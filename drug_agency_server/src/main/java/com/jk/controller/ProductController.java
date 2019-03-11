package com.jk.controller;

import com.jk.pojo.ProductAgency;
import com.jk.pojo.ProductAgencyDto;
import com.jk.service.ProductService;
import com.jk.service.ProductServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProductController implements ProductServiceApi {

    @Autowired
    private ProductService productService;
    @ResponseBody
    @Override
    public void frameTest() {
        String str=productService.frameTest();
        System.out.println("已进入到server");
        System.out.println(str);
    }
    @ResponseBody
    @Override
    public String saveAgencyInfo(@RequestBody ProductAgency productAgency) {
        int i = productService.saveAgencyInfo(productAgency);
        String str="";
        if(i!=0){
            str="添加成功";
        }else{
            str="添加失败";
        }
        return str;
    }
    @GetMapping("queryAgencyInfo")
    @ResponseBody
    @Override
    public List<ProductAgencyDto> queryAgencyInfo() {

        return productService.queryAgencyInfo();
    }
}
