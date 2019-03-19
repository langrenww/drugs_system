package com.jk.pojo;

import java.io.Serializable;

public class ShoppingCart implements Serializable {

    private Integer drugId;  //主键
    private String drugName; //药品名称
    private String drugImg;  //药品图片
    private String drugSize; //药品规格
    private String drugManufacturer; //生产厂家
    private Double drugMoney;  //药品单价
    private Integer drugNumber; //药品数量
    private String userId; //用户Id


    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getDrugImg() {
        return drugImg;
    }

    public void setDrugImg(String drugImg) {
        this.drugImg = drugImg;
    }

    public String getDrugSize() {
        return drugSize;
    }

    public void setDrugSize(String drugSize) {
        this.drugSize = drugSize;
    }

    public String getDrugManufacturer() {
        return drugManufacturer;
    }

    public void setDrugManufacturer(String drugManufacturer) {
        this.drugManufacturer = drugManufacturer;
    }

    public Double getDrugMoney() {
        return drugMoney;
    }

    public void setDrugMoney(Double drugMoney) {
        this.drugMoney = drugMoney;
    }

    public Integer getDrugNumber() {
        return drugNumber;
    }

    public void setDrugNumber(Integer drugNumber) {
        this.drugNumber = drugNumber;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "drugId=" + drugId +
                ", drugName='" + drugName + '\'' +
                ", drugImg='" + drugImg + '\'' +
                ", drugSize='" + drugSize + '\'' +
                ", drugManufacturer='" + drugManufacturer + '\'' +
                ", drugMoney=" + drugMoney +
                ", drugNumber=" + drugNumber +
                ", userId='" + userId + '\'' +
                '}';
    }
}
