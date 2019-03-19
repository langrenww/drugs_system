package com.jk.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class AgencyAndMerchants {
    private   Integer   id;   //主键
    private   String   encoding;//编号
    private   String productName;//产品名称
    private   String   specification;//规格
    private   String manufacturer;//生产厂家
    private   Integer  districtId;//区域id
    private String districtName;//区域名称
    private String districtProvinceName;//省名称
    private String districtCityName;//市名称
    private   Integer classify;//分类
    private Integer classifySon;//子分类
    private Integer classifyGrandSon;//孙分类
    private Integer dateSort;//1按照时间升序 2按照时间降序
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date releaseDate;



    public Integer getDateSort() {
        return dateSort;
    }

    public void setDateSort(Integer dateSort) {
        this.dateSort = dateSort;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getDistrictProvinceName() {
        return districtProvinceName;
    }

    public void setDistrictProvinceName(String districtProvinceName) {
        this.districtProvinceName = districtProvinceName;
    }

    public String getDistrictCityName() {
        return districtCityName;
    }

    public void setDistrictCityName(String districtCityName) {
        this.districtCityName = districtCityName;
    }

    public Integer getClassifySon() {
        return classifySon;
    }

    public void setClassifySon(Integer classifySon) {
        this.classifySon = classifySon;
    }

    public Integer getClassifyGrandSon() {
        return classifyGrandSon;
    }

    public void setClassifyGrandSon(Integer classifyGrandSon) {
        this.classifyGrandSon = classifyGrandSon;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public Integer getClassify() {
        return classify;
    }

    public void setClassify(Integer classify) {
        this.classify = classify;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "AgencyAndMerchants{" +
                "id=" + id +
                ", encoding='" + encoding + '\'' +
                ", productName='" + productName + '\'' +
                ", specification='" + specification + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", districtId=" + districtId +
                ", districtName='" + districtName + '\'' +
                ", districtProvinceName='" + districtProvinceName + '\'' +
                ", districtCityName='" + districtCityName + '\'' +
                ", classify=" + classify +
                ", classifySon=" + classifySon +
                ", classifyGrandSon=" + classifyGrandSon +
                ", releaseDate=" + releaseDate +
                ", dateSort=" + dateSort +
                '}';
    }
}
