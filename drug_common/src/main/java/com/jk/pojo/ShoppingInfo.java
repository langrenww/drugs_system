package com.jk.pojo;

public class ShoppingInfo {
    private Integer id;
    private String realname;
    private String phone;
    private String drugname;
    private String factory;
    private String batchNumber;
    private String specification;
    private Integer num;
    private Integer drugtype;
    private Integer keeptime;
    private String introduction;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDrugname() {
        return drugname;
    }

    public void setDrugname(String drugname) {
        this.drugname = drugname;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getDrugtype() {
        return drugtype;
    }

    public void setDrugtype(Integer drugtype) {
        this.drugtype = drugtype;
    }

    public Integer getKeeptime() {
        return keeptime;
    }

    public void setKeeptime(Integer keeptime) {
        this.keeptime = keeptime;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    @Override
    public String toString() {
        return "ShoppingInfo{" +
                "id=" + id +
                ", realname='" + realname + '\'' +
                ", phone='" + phone + '\'' +
                ", drugname='" + drugname + '\'' +
                ", factory='" + factory + '\'' +
                ", batchNumber='" + batchNumber + '\'' +
                ", specification='" + specification + '\'' +
                ", num=" + num +
                ", drugtype=" + drugtype +
                ", keeptime=" + keeptime +
                ", introduction='" + introduction + '\'' +
                '}';
    }
}
