package com.jk.controller;

import com.jk.service.ProductService;
import com.jk.service.ProductServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
