package com.jk.congtroller;

import com.jk.pojo.SupplierDrug;
import com.jk.service.QueryDrugByIssuedStatusServiceWeb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class QueryDrugByIssuedStatusControllerWeb {
    @Autowired
    private QueryDrugByIssuedStatusServiceWeb queryDrugByIssuedStatusServiceWeb;
    @PostMapping("QueryDrugByIssuedStatus")
    @ResponseBody
    public List<SupplierDrug> QueryDrugByIssuedStatus(@RequestBody SupplierDrug supplierDrug){
        List<SupplierDrug> list=new ArrayList<SupplierDrug>();
        list = queryDrugByIssuedStatusServiceWeb.QueryDrugByIssuedStatus(supplierDrug);
        return list;

    }

    /**
     * 批量上架
     * @param ids
     */
    @PutMapping(value="updateIssuedStatus",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public void updateIssuedStatus(@RequestBody String[] ids){

        queryDrugByIssuedStatusServiceWeb.updateIssuedStatus(ids);
    }
    /**
     * 批量下架
     * @param ids
     */
    @PutMapping(value="updateIssuedStatus2",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public void updateIssuedStatus2(@RequestBody String[] ids){

        queryDrugByIssuedStatusServiceWeb.updateIssuedStatus2(ids);
    }
    /**
     * 删除已发布商品
     */
    @DeleteMapping("deleteDrugById")
    @ResponseBody
    public void deleteDrugById(String id){
        queryDrugByIssuedStatusServiceWeb.deleteDrugById(id);
    }
    /**
     * 修改回显已发布商品
     */
    @GetMapping("queryDrugById")
    @ResponseBody
    public List<SupplierDrug> queryDrugById(@RequestParam("id") String id){
        List<SupplierDrug> list=new ArrayList<SupplierDrug>();
        list = queryDrugByIssuedStatusServiceWeb.queryDrugById(id);
        return list;
    }
    /**
     * 修改已发布商品
     */
    @PostMapping ("updateDrug")
    @ResponseBody
    public void updateDrug(@RequestBody SupplierDrug supplierDrug){
        queryDrugByIssuedStatusServiceWeb.updateDrug(supplierDrug);
    }
    /**
     * 新增发布商品
     */
    @PostMapping ("saveDrug")
    @ResponseBody
    public void saveDrug(@RequestBody SupplierDrug supplierDrug){
        queryDrugByIssuedStatusServiceWeb.saveDrug(supplierDrug);
    }
    /**
     * 根据推广状态不是未推广查询
     */
    @PostMapping("QueryDrugBySpreadStatus")
    @ResponseBody
    public List<SupplierDrug> QueryDrugBySpreadStatus(@RequestBody SupplierDrug supplierDrug){
        List<SupplierDrug> list=new ArrayList<SupplierDrug>();
        list = queryDrugByIssuedStatusServiceWeb.QueryDrugBySpreadStatus(supplierDrug);
        return list;

    }
    /**
     * 根据推广状态是未推广查询
     */
    @PostMapping("QueryDrugBySpreadStatus2")
    @ResponseBody
    public List<SupplierDrug> QueryDrugBySpreadStatus2(@RequestBody SupplierDrug supplierDrug){
        List<SupplierDrug> list=new ArrayList<SupplierDrug>();
        list = queryDrugByIssuedStatusServiceWeb.QueryDrugBySpreadStatus2(supplierDrug);
        return list;

    }
    /**
     * 批量推广
     */
    @PutMapping(value="updateSpread",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public void updateSpread(@RequestBody String[] ids){

        queryDrugByIssuedStatusServiceWeb.updateSpread(ids);
    }
    /**
     * 批量取消推广
     */
    @PutMapping(value="updateSpread2",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public void updateSpread2(@RequestBody String[] ids){

        queryDrugByIssuedStatusServiceWeb.updateSpread2(ids);
    }
    /**
     * 删除取消推广商品
     */
    @DeleteMapping("deleteSpreadById")
    @ResponseBody
    public void deleteSpreadById(String id){
        queryDrugByIssuedStatusServiceWeb.deleteSpreadById(id);
    }
}
