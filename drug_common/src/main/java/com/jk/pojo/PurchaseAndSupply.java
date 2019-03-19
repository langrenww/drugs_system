package com.jk.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class PurchaseAndSupply {
    private   Integer          id; //主键
    private  String        productName;//产品名称
    private  String        specification;//规格
    private   String         manufacturer;//生产厂家
    private String     contactNumber;//联系电话
    private  String      contacts;//联系人
    private   Integer         quantity;//数量
    private   Integer  classify;//分类
    private String classifyName;//分类名称
    private Integer dateSort;//按照数量或者时间排序 1数量 2时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date releaseDate;//发布日期

    public Integer getDateSort() {
        return dateSort;
    }

    public void setDateSort(Integer dateSort) {
        this.dateSort = dateSort;
    }

    public String getClassifyName() {
        return classifyName;
    }

    public void setClassifyName(String classifyName) {
        this.classifyName = classifyName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String  getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String  manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
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
        return "PurchaseAndSupply{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", specification='" + specification + '\'' +
                ", manufacturer=" + manufacturer +
                ", contactNumber=" + contactNumber +
                ", contacts='" + contacts + '\'' +
                ", quantity=" + quantity +
                ", classify=" + classify +
                ", classifyName='" + classifyName + '\'' +
                ", dateSort='" + dateSort + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
