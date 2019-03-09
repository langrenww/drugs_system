package com.jk.dao;

import com.jk.pojo.SupplierDrug;

import java.util.List;

public interface SupplierDao {
    List<SupplierDrug> SupperDrugFind(Integer supplierId);

    List<SupplierDrug> ShoppingFind();
}