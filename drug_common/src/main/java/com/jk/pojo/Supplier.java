package com.jk.pojo;

public class Supplier {
      private   Integer   id;
    private   String   loginName;          //登录账号
    private String   contactInformation;   //联系方式
    private String  shopName;              //店铺名称
    private String   phoneNumber;          //电话号码
    private  String  legalRepresentative;  //法定代表人
    private  String  principalNumber;      //委托负责人手机
    private  String   principal;            //委托负责人
    private  String  contactAddress;       //联系地址
    private   String  companyName;         //公司名称
    private  String  organizationName;     //单位名称
    private  String organizationType;      //单位类型
    private   String  drugCategory;        //药品经营种类 1中西药品 2医疗器械 3成人用品 4中药饮片 5母婴用品 6滋补养生 7保健用品 8药品原料
    private   String  supplyType;          //供应类型

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLegalRepresentative() {
        return legalRepresentative;
    }

    public void setLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative;
    }

    public String getPrincipalNumber() {
        return principalNumber;
    }

    public void setPrincipalNumber(String principalNumber) {
        this.principalNumber = principalNumber;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(String organizationType) {
        this.organizationType = organizationType;
    }

    public String getDrugCategory() {
        return drugCategory;
    }

    public void setDrugCategory(String drugCategory) {
        this.drugCategory = drugCategory;
    }

    public String getSupplyType() {
        return supplyType;
    }

    public void setSupplyType(String supplyType) {
        this.supplyType = supplyType;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "id=" + id +
                ", loginName='" + loginName + '\'' +
                ", contactInformation='" + contactInformation + '\'' +
                ", shopName='" + shopName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", legalRepresentative='" + legalRepresentative + '\'' +
                ", principalNumber='" + principalNumber + '\'' +
                ", principal='" + principal + '\'' +
                ", contactAddress='" + contactAddress + '\'' +
                ", companyName='" + companyName + '\'' +
                ", organizationName='" + organizationName + '\'' +
                ", organizationType='" + organizationType + '\'' +
                ", drugCategory='" + drugCategory + '\'' +
                ", supplyType='" + supplyType + '\'' +
                '}';
    }
}
