package com.jk.dao;

import com.jk.pojo.SupplierDrug;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface SupplierDao {
    List<SupplierDrug> SupperDrugFind(Integer supplierId);
}
