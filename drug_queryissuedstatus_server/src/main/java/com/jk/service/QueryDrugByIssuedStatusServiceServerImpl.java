package com.jk.service;

import com.jk.mapper.QueryDrugByIssuedStatusMapperServer;
import com.jk.pojo.SupplierDrug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class QueryDrugByIssuedStatusServiceServerImpl implements QueryDrugByIssuedStatusServiceServer {
    @Autowired
    private QueryDrugByIssuedStatusMapperServer queryDrugByIssuedStatusMapperServer;

    @Override

    public List<SupplierDrug> QueryDrugByIssuedStatus(SupplierDrug supplierDrug) {
        List<SupplierDrug> list = new ArrayList<SupplierDrug>();
        list = queryDrugByIssuedStatusMapperServer.QueryDrugByIssuedStatus(supplierDrug);
        return list;
    }

    @Override
    public void updateIssuedStatus(String[] ids) {
        queryDrugByIssuedStatusMapperServer.updateIssuedStatus(ids);
    }

    @Override
    public void updateIssuedStatus2(String[] ids) {
        queryDrugByIssuedStatusMapperServer.updateIssuedStatus2(ids);
    }

    @Override
    public void deleteDrugById(String id) {
        queryDrugByIssuedStatusMapperServer.deleteDrugById(id);
    }

    @Override
    public List<SupplierDrug> queryDrugById(String id) {
        List<SupplierDrug> list = new ArrayList<SupplierDrug>();
        list = queryDrugByIssuedStatusMapperServer.queryDrugById(id);
        return list;
    }

    @Override
    public void updateDrug(SupplierDrug supplierDrug) {
        queryDrugByIssuedStatusMapperServer.updateDrug(supplierDrug);
    }

    @Override
    public void saveDrug(SupplierDrug supplierDrug) {
        queryDrugByIssuedStatusMapperServer.saveDrug(supplierDrug);
    }

    @Override
    public List<SupplierDrug> QueryDrugBySpreadStatus(SupplierDrug supplierDrug) {
        List<SupplierDrug> list = new ArrayList<SupplierDrug>();
        list = queryDrugByIssuedStatusMapperServer.QueryDrugBySpreadStatus(supplierDrug);
        return list;
    }
    @Override
    public List<SupplierDrug> QueryDrugBySpreadStatus2(SupplierDrug supplierDrug) {
        List<SupplierDrug> list = new ArrayList<SupplierDrug>();
        list = queryDrugByIssuedStatusMapperServer.QueryDrugBySpreadStatus2(supplierDrug);
        return list;
    }

    @Override
    public void updateSpread(String[] ids) {
        queryDrugByIssuedStatusMapperServer.updateSpread(ids);
    }
    @Override
    public void updateSpread2(String[] ids) {
        queryDrugByIssuedStatusMapperServer.updateSpread2(ids);
    }

    @Override
    public void deleteSpreadById(String id) {
        queryDrugByIssuedStatusMapperServer.deleteSpreadById(id);
    }
}
