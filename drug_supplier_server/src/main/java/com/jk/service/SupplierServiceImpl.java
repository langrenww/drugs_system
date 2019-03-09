package com.jk.service;


import com.jk.dao.SupplierDao;
import com.jk.pojo.SupplierDrug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    private SupplierDao supplierDao;

    @Override
    public List<SupplierDrug> SupperDrugFind(Integer supplierId) {
        return supplierDao.SupperDrugFind(supplierId);
    }

    @Override
    public List<SupplierDrug> ShoppingFind() {
        return supplierDao.ShoppingFind();
    }
}