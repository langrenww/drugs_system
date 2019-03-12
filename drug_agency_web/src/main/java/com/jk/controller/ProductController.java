package com.jk.controller;

import com.jk.pojo.ProductAgency;
import com.jk.pojo.ProductAgencyDto;
import com.jk.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("frameTest")
    @ResponseBody
    public String frameTest(){
        productService.frameTest();
        System.out.println("已进入到web");
        return null;
    }

    /**
     * 添加代理信息
     * @param productAgency
     * @return
     */
    @PostMapping("saveAgencyInfo")
    @ResponseBody
    public String saveAgencyInfo(@RequestBody ProductAgency productAgency) {
        String str = productService.saveAgencyInfo(productAgency);
        return str;
    }
    //查询地区代理人和信息
    @GetMapping("queryAgencyInfo")
    @ResponseBody
    public List<ProductAgencyDto> queryAgencyInfo() {

        return productService.queryAgencyInfo();
    }

    /**
     * 删除单条代理信息
     * @param id
     * @return
     */
    @DeleteMapping("deleteAgencyInfo")
    @ResponseBody
    public String deleteAgencyInfo(String  id){
       String str= productService.deleteAgencyInfo(id);
        return str;
    }
}
