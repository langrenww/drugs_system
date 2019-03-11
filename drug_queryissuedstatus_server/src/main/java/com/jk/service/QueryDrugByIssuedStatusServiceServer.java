package com.jk.service;

import com.jk.pojo.SupplierDrug;

import java.util.List;

public interface QueryDrugByIssuedStatusServiceServer {
    List<SupplierDrug> QueryDrugByIssuedStatus(SupplierDrug supplierDrug);

    void updateIssuedStatus(String[] ids);

    void updateIssuedStatus2(String[] ids);

    void deleteDrugById(String id);

    List<SupplierDrug> queryDrugById(String id);

    void updateDrug(SupplierDrug supplierDrug);

    void saveDrug(SupplierDrug supplierDrug);

    List<SupplierDrug> QueryDrugBySpreadStatus(SupplierDrug supplierDrug);

    List<SupplierDrug> QueryDrugBySpreadStatus2(SupplierDrug supplierDrug);

    void updateSpread(String[] ids);

    void updateSpread2(String[] ids);

    void deleteSpreadById(String id);
}
