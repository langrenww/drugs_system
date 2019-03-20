package com.jk.controller;

import com.jk.pojo.*;
import com.jk.service.IOssService;
import com.jk.service.ProductService;
import com.jk.service.ProductServiceApi;
import com.jk.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class ProductController implements ProductServiceApi {

    @Autowired
    private ProductService productService;
    @Resource
    private IOssService ossService;
    @ResponseBody
    @Override
    public void frameTest() {
        String str=productService.frameTest();
        System.out.println("已进入到server");
        System.out.println(str);
    }
    @PostMapping("saveAgencyInfo")
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
    @Override
    @DeleteMapping("deleteAgencyInfo")
    @ResponseBody

    public String deleteAgencyInfo(@RequestBody String  id) {
        int i=productService.deleteAgencyInfo(id);
        String str="";
        if(i!=0){
            str="删除成功";
        }else{
            str="删除失败";
        }
        return str;
    }
    @PostMapping ("toConnect")
    @ResponseBody
    @Override
    public List<District> selectDirect(@RequestBody String pid) {

        return  productService.selectDirect(pid);
    }
    @PostMapping("submitAuditInfo")
    @ResponseBody
    @Override
    public String submitAuditInfo(@RequestBody EnterpriseQualificationDetail enterpriseQualificationDetail) {
       int i= productService.submitAuditInfo(enterpriseQualificationDetail);
        String str="";
        if(i!=0){
            str="添加成功";
        }else{
            str="添加失败";
        }
        return str;
    }
    @PutMapping("updateAgencyInfo")
    @ResponseBody
    @Override
    public String updateAgencyInfo(@RequestBody String id) {
        int i = productService.updateAgencyInfo(id);
        String str="";
        if(i!=0){
            str="审核成功";
        }else{
            str="审核失败";
        }
        return str;
    }
    @GetMapping("approveAgencyInfo")
    @ResponseBody
    @Override
    public List<ProductAgencyDto> approveAgencyInfo() {

        return productService.approveAgencyInfo();
    }

    @GetMapping  ("queryGoodsById")
    @ResponseBody
    @Override
    public List<Goods> queryGoodsById(@RequestParam("pid") Integer pid) {


        return productService.queryGoodsById(pid);
    }
    @GetMapping("queryNewGoods")
    @ResponseBody
    @Override
    public List<NewestGoods> queryNewGoods() {
        return productService.queryNewGoods();
    }
    @PostMapping("addSupplyGoods")
    @ResponseBody
    @Override
    public void addSupplyGoods(@RequestBody ShoppingInfo shoppingInfo) {
        productService.addSupplyGoods(shoppingInfo);
    }
    @GetMapping("querySupplyGoods")
    @ResponseBody
    @Override
    public List<ShoppingInfo> querySupplyGoods() {

        return productService.querySupplyGoods();
    }

    @PostMapping(value = "uploadImg")
    @ResponseBody
    public  String uploadImg(MultipartFile imgs,HttpServletRequest request, HttpServletResponse response) throws IOException {
        String uploadImg = ossService.uploadImg(imgs);
        return uploadImg ;
    }



}
