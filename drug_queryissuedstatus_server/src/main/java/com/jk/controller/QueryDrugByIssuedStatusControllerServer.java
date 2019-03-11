package com.jk.controller;

import com.jk.pojo.SupplierDrug;
import com.jk.service.QueryDrugByIssuedStatusServiceApi;
import com.jk.service.QueryDrugByIssuedStatusServiceServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class QueryDrugByIssuedStatusControllerServer implements QueryDrugByIssuedStatusServiceApi {
    @Autowired
    private QueryDrugByIssuedStatusServiceServer queryDrugByIssuedStatusServiceServer;

    @Override
    @PostMapping("QueryDrugByIssuedStatus")
    @ResponseBody
    public List<SupplierDrug> QueryDrugByIssuedStatus(@RequestBody SupplierDrug supplierDrug) {
        List<SupplierDrug> list = new ArrayList<SupplierDrug>();
        list = queryDrugByIssuedStatusServiceServer.QueryDrugByIssuedStatus(supplierDrug);
        return list;
    }

    @Override
    @PutMapping("updateIssuedStatus")
    @ResponseBody
    public void updateIssuedStatus(@RequestBody String[] ids) {
        queryDrugByIssuedStatusServiceServer.updateIssuedStatus(ids);
    }

    @Override
    @PutMapping("updateIssuedStatus2")
    @ResponseBody
    public void updateIssuedStatus2(@RequestBody String[] ids) {
        queryDrugByIssuedStatusServiceServer.updateIssuedStatus2(ids);
    }

    @Override
    @DeleteMapping("deleteDrugById")
    @ResponseBody
    public void deleteDrugById(@RequestBody String id) {
        queryDrugByIssuedStatusServiceServer.deleteDrugById(id);
    }

    @Override
    @GetMapping("queryDrugById")
    @ResponseBody
    public List<SupplierDrug> queryDrugById(@RequestParam("id") String id) {
        List<SupplierDrug> list = new ArrayList<SupplierDrug>();
        list = queryDrugByIssuedStatusServiceServer.queryDrugById(id);
        return list;
    }

    @Override
    @PostMapping("updateDrug")
    @ResponseBody
    public void updateDrug(@RequestBody SupplierDrug supplierDrug) {
        queryDrugByIssuedStatusServiceServer.updateDrug(supplierDrug);
    }

    @Override
    @PostMapping("saveDrug")
    @ResponseBody
    public void saveDrug(@RequestBody SupplierDrug supplierDrug) {
        queryDrugByIssuedStatusServiceServer.saveDrug(supplierDrug);
    }

    @Override
    @PostMapping("QueryDrugBySpreadStatus")
    @ResponseBody
    public List<SupplierDrug> QueryDrugBySpreadStatus(@RequestBody SupplierDrug supplierDrug) {
        List<SupplierDrug> list = new ArrayList<SupplierDrug>();
        list = queryDrugByIssuedStatusServiceServer.QueryDrugBySpreadStatus(supplierDrug);
        return list;
    }
    @Override
    @PostMapping("QueryDrugBySpreadStatus2")
    @ResponseBody
    public List<SupplierDrug> QueryDrugBySpreadStatus2(@RequestBody SupplierDrug supplierDrug) {
        List<SupplierDrug> list = new ArrayList<SupplierDrug>();
        list = queryDrugByIssuedStatusServiceServer.QueryDrugBySpreadStatus2(supplierDrug);
        return list;
    }

    @Override
    @PutMapping("updateSpread")
    @ResponseBody
    public void updateSpread(@RequestBody String[] ids) {
        queryDrugByIssuedStatusServiceServer.updateSpread(ids);
    }
    @Override
    @PutMapping("updateSpread2")
    @ResponseBody
    public void updateSpread2(@RequestBody String[] ids) {
        queryDrugByIssuedStatusServiceServer.updateSpread2(ids);
    }
    @Override
    @DeleteMapping("deleteSpreadById")
    @ResponseBody
    public void deleteSpreadById(@RequestBody String id) {
        queryDrugByIssuedStatusServiceServer.deleteSpreadById(id);
    }
}
