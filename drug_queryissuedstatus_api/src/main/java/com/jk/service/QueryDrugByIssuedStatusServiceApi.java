package com.jk.service;

import com.jk.pojo.SupplierDrug;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface QueryDrugByIssuedStatusServiceApi {

    @PostMapping("QueryDrugByIssuedStatus")
    List<SupplierDrug> QueryDrugByIssuedStatus(SupplierDrug supplierDrug);
    @PutMapping("updateIssuedStatus")
    void updateIssuedStatus(String[] ids);
    @PutMapping("updateIssuedStatus2")
    void updateIssuedStatus2(String[] ids);
    @DeleteMapping("deleteDrugById")
    void deleteDrugById(String id);
    @GetMapping("queryDrugById")
    List<SupplierDrug> queryDrugById(@RequestParam("id") String id);
    @PostMapping("updateDrug")
    void updateDrug(SupplierDrug supplierDrug);
    @PostMapping("saveDrug")
    void saveDrug(SupplierDrug supplierDrug);
    @PostMapping("QueryDrugBySpreadStatus")
    List<SupplierDrug> QueryDrugBySpreadStatus(SupplierDrug supplierDrug);
    @PostMapping("QueryDrugBySpreadStatus2")
    List<SupplierDrug> QueryDrugBySpreadStatus2(SupplierDrug supplierDrug);
    @PutMapping("updateSpread")
    void updateSpread(String[] ids);
    @PutMapping("updateSpread2")
    void updateSpread2(String[] ids);
    @DeleteMapping("deleteSpreadById")
    void deleteSpreadById(String id);
}
