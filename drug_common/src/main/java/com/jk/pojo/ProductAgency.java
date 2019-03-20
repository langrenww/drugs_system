package com.jk.pojo;

import jdk.nashorn.internal.objects.annotations.Setter;

import java.math.BigDecimal;

public class ProductAgency {
    private Integer productId;
    private String productName;
    private String productCommonName;
    private String productManufacturers;
    private String productBrand;
    private String productDistributionChannel;
    private Integer productMessageValidPeriod;
    private String productPhoto;
    private String demandDescribe;
    private String productLinkman;
    private String contactPhone;
    private String contactAddress;
    private Integer drugTypeName;
    private Integer rcDistrictId;
    private Integer productStatus;


    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCommonName() {
        return productCommonName;
    }

    public void setProductCommonName(String productCommonName) {
        this.productCommonName = productCommonName;
    }

    public String getProductManufacturers() {
        return productManufacturers;
    }

    public void setProductManufacturers(String productManufacturers) {
        this.productManufacturers = productManufacturers;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getProductDistributionChannel() {
        return productDistributionChannel;
    }

    public void setProductDistributionChannel(String productDistributionChannel) {
        this.productDistributionChannel = productDistributionChannel;
    }

    public Integer getProductMessageValidPeriod() {
        return productMessageValidPeriod;
    }

    public void setProductMessageValidPeriod(Integer productMessageValidPeriod) {
        this.productMessageValidPeriod = productMessageValidPeriod;
    }

    public String getProductPhoto() {
        return productPhoto;
    }

    public void setProductPhoto(String productPhoto) {
        this.productPhoto = productPhoto;
    }

    public String getDemandDescribe() {
        return demandDescribe;
    }

    public void setDemandDescribe(String demandDescribe) {
        this.demandDescribe = demandDescribe;
    }

    public String getProductLinkman() {
        return productLinkman;
    }

    public void setProductLinkman(String productLinkman) {
        this.productLinkman = productLinkman;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public Integer getDrugTypeName() {
        return drugTypeName;
    }

    public void setDrugTypeName(Integer drugTypeName) {
        this.drugTypeName = drugTypeName;
    }

    public Integer getRcDistrictId() {
        return rcDistrictId;
    }

    public void setRcDistrictId(Integer rcDistrictId) {
        this.rcDistrictId = rcDistrictId;
    }

    public Integer getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
    }

    @Override
    public String toString() {
        return "ProductAgency{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productCommonName='" + productCommonName + '\'' +
                ", productManufacturers='" + productManufacturers + '\'' +
                ", productBrand='" + productBrand + '\'' +
                ", productDistributionChannel='" + productDistributionChannel + '\'' +
                ", productMessageValidPeriod=" + productMessageValidPeriod +
                ", productPhoto='" + productPhoto + '\'' +
                ", demandDescribe='" + demandDescribe + '\'' +
                ", productLinkman='" + productLinkman + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                ", contactAddress='" + contactAddress + '\'' +
                ", drugTypeName=" + drugTypeName +
                ", rcDistrictId=" + rcDistrictId +
                ", productStatus=" + productStatus +
                '}';
    }
}
