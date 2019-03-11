package com.jk.pojo;

public class ProductAgencyDto extends ProductAgency {
    //代理区域
    private String agencyArea;
    //代理省级别
    private String agencyProvince;
    //代理市级别
    private String agencyCity;
    //代理需求
    private String agencyDemand;


    public String getAgencyArea() {
        return agencyArea;
    }

    public String getAgencyProvince() {
        return agencyProvince;
    }

    public void setAgencyProvince(String agencyProvince) {
        this.agencyProvince = agencyProvince;
    }

    public String getAgencyCity() {
        return agencyCity;
    }

    public void setAgencyCity(String agencyCity) {
        this.agencyCity = agencyCity;
    }

    public void setAgencyArea(String agencyArea) {
        this.agencyArea = agencyArea;
    }

    public String getAgencyDemand() {
        return agencyDemand;
    }

    public void setAgencyDemand(String agencyDemand) {
        this.agencyDemand = agencyDemand;
    }
}
