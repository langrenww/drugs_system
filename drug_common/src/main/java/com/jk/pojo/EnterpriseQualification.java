package com.jk.pojo;

public class EnterpriseQualification {
    /** 主键ID */
    private Integer enterpriseId ;
    /** 经营种类 */
    private String bussinessType ;
    /** 营业执照注册号 */
    private String certificateNumber ;
    /** 企业名称 */
    private String enterpriseName ;
    /** 联系人 */
    private String enterpriseMan ;
    /** 联系电话 */
    private String enterprisePhone ;
    /** 所属区域 */
    private Integer enterpriseArea ;
    /** 详细地址 */
    private String enterpriseAddress ;
    /** 供应区域 */
    private Integer enterpriseSupplyArea ;
    /** 审核人 */
    private Integer checkUserId ;
    /** 审核状态 */
    private Integer checkStatus ;

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getBussinessType() {
        return bussinessType;
    }

    public void setBussinessType(String bussinessType) {
        this.bussinessType = bussinessType;
    }

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getEnterpriseMan() {
        return enterpriseMan;
    }

    public void setEnterpriseMan(String enterpriseMan) {
        this.enterpriseMan = enterpriseMan;
    }

    public String getEnterprisePhone() {
        return enterprisePhone;
    }

    public void setEnterprisePhone(String enterprisePhone) {
        this.enterprisePhone = enterprisePhone;
    }

    public Integer getEnterpriseArea() {
        return enterpriseArea;
    }

    public void setEnterpriseArea(Integer enterpriseArea) {
        this.enterpriseArea = enterpriseArea;
    }

    public String getEnterpriseAddress() {
        return enterpriseAddress;
    }

    public void setEnterpriseAddress(String enterpriseAddress) {
        this.enterpriseAddress = enterpriseAddress;
    }

    public Integer getEnterpriseSupplyArea() {
        return enterpriseSupplyArea;
    }

    public void setEnterpriseSupplyArea(Integer enterpriseSupplyArea) {
        this.enterpriseSupplyArea = enterpriseSupplyArea;
    }

    public Integer getCheckUserId() {
        return checkUserId;
    }

    public void setCheckUserId(Integer checkUserId) {
        this.checkUserId = checkUserId;
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }
}
