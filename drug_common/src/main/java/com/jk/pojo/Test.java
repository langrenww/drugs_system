package com.jk.pojo;

public class Test {
   private  Integer supplierId;
    private  String supplierName;

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    @Override
    public String toString() {
        return "Test{" +
                "supplierId=" + supplierId +
                ", supplierName='" + supplierName + '\'' +
                '}';
    }
}
