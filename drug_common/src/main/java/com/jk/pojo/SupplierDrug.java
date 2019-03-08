package com.jk.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class SupplierDrug {
    private Integer id;//药品id
    private String name; //药品名称
    private Integer supplierId; //供应商id
    private BigDecimal price;// 药品单价
    private String specification;//规格
    private Date productionDate;//生产时间
    private String quantity;//中包装数量
    private String stocks;//药品库存
    private String manufacturer;//生产厂家
    private String  drugImg;//药品图片
    private String  buyStatus;//购买状态
    private String  drugMnemonicCode;//助记码
    private String  drugLicenseNumber;//批准文号
    private String  drugNumber;//药品编号
    private String  drugAnotherName;//药品别名
    private String  drugZeroSale;//是否拆零销售
    private String  drugLargePackingQuantity;//大包装数量
    private String  drugSalesControl;//商品销售控制
    private String  drugShelfLife;//保质期
    private String  drugMarketPrice;//市场价格
    private String  drugVoid;//视频
    private String  buyerId;//采购商id
    private String  drugCommodityQualification;//商品资质
    private String  drugCommercialDosage;//商品剂型
    private String  drugList;//基药目录
    private String  medicareTypeId;//医保类型
    private String  drugPrescribed;//是否处方药
    private String  drugBases;//主要成分
    private String  drugIndications_function;//主治功能
    private String  drugContraindication;//禁忌
    private String  drugReaction;//不良反应
    private String  drugCandicine;//详情描述
    private String  drugConsiderations;//注意事项
    private String  drugToxicology;//药物毒理
    private String  drugOverdose;//药物过量
    private String  drugInteraction;//药物相互作用
    private String  drugDosage;//用法用量
    private String  shopRecommendation;//店铺推荐
    private String  warningCount;//库存数量警告
    private String  freightFree;//是否免运费
    private String  auditType;//审核状态
    private String  issuedStatus;//发布状态


    public String getBuyStatus() {
        return buyStatus;
    }

    public void setBuyStatus(String buyStatus) {
        this.buyStatus = buyStatus;
    }

    public String getDrugMnemonicCode() {
        return drugMnemonicCode;
    }

    public void setDrugMnemonicCode(String drugMnemonicCode) {
        this.drugMnemonicCode = drugMnemonicCode;
    }

    public String getDrugLicenseNumber() {
        return drugLicenseNumber;
    }

    public void setDrugLicenseNumber(String drugLicenseNumber) {
        this.drugLicenseNumber = drugLicenseNumber;
    }

    public String getDrugNumber() {
        return drugNumber;
    }

    public void setDrugNumber(String drugNumber) {
        this.drugNumber = drugNumber;
    }

    public String getDrugAnotherName() {
        return drugAnotherName;
    }

    public void setDrugAnotherName(String drugAnotherName) {
        this.drugAnotherName = drugAnotherName;
    }

    public String getDrugZeroSale() {
        return drugZeroSale;
    }

    public void setDrugZeroSale(String drugZeroSale) {
        this.drugZeroSale = drugZeroSale;
    }

    public String getDrugLargePackingQuantity() {
        return drugLargePackingQuantity;
    }

    public void setDrugLargePackingQuantity(String drugLargePackingQuantity) {
        this.drugLargePackingQuantity = drugLargePackingQuantity;
    }

    public String getDrugSalesControl() {
        return drugSalesControl;
    }

    public void setDrugSalesControl(String drugSalesControl) {
        this.drugSalesControl = drugSalesControl;
    }

    public String getDrugShelfLife() {
        return drugShelfLife;
    }

    public void setDrugShelfLife(String drugShelfLife) {
        this.drugShelfLife = drugShelfLife;
    }

    public String getDrugMarketPrice() {
        return drugMarketPrice;
    }

    public void setDrugMarketPrice(String drugMarketPrice) {
        this.drugMarketPrice = drugMarketPrice;
    }

    public String getDrugVoid() {
        return drugVoid;
    }

    public void setDrugVoid(String drugVoid) {
        this.drugVoid = drugVoid;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getDrugCommodityQualification() {
        return drugCommodityQualification;
    }

    public void setDrugCommodityQualification(String drugCommodityQualification) {
        this.drugCommodityQualification = drugCommodityQualification;
    }

    public String getDrugCommercialDosage() {
        return drugCommercialDosage;
    }

    public void setDrugCommercialDosage(String drugCommercialDosage) {
        this.drugCommercialDosage = drugCommercialDosage;
    }

    public String getDrugList() {
        return drugList;
    }

    public void setDrugList(String drugList) {
        this.drugList = drugList;
    }

    public String getMedicareTypeId() {
        return medicareTypeId;
    }

    public void setMedicareTypeId(String medicareTypeId) {
        this.medicareTypeId = medicareTypeId;
    }

    public String getDrugPrescribed() {
        return drugPrescribed;
    }

    public void setDrugPrescribed(String drugPrescribed) {
        this.drugPrescribed = drugPrescribed;
    }

    public String getDrugBases() {
        return drugBases;
    }

    public void setDrugBases(String drugBases) {
        this.drugBases = drugBases;
    }

    public String getDrugIndications_function() {
        return drugIndications_function;
    }

    public void setDrugIndications_function(String drugIndications_function) {
        this.drugIndications_function = drugIndications_function;
    }

    public String getDrugContraindication() {
        return drugContraindication;
    }

    public void setDrugContraindication(String drugContraindication) {
        this.drugContraindication = drugContraindication;
    }

    public String getDrugReaction() {
        return drugReaction;
    }

    public void setDrugReaction(String drugReaction) {
        this.drugReaction = drugReaction;
    }

    public String getDrugCandicine() {
        return drugCandicine;
    }

    public void setDrugCandicine(String drugCandicine) {
        this.drugCandicine = drugCandicine;
    }

    public String getDrugConsiderations() {
        return drugConsiderations;
    }

    public void setDrugConsiderations(String drugConsiderations) {
        this.drugConsiderations = drugConsiderations;
    }

    public String getDrugToxicology() {
        return drugToxicology;
    }

    public void setDrugToxicology(String drugToxicology) {
        this.drugToxicology = drugToxicology;
    }

    public String getDrugOverdose() {
        return drugOverdose;
    }

    public void setDrugOverdose(String drugOverdose) {
        this.drugOverdose = drugOverdose;
    }

    public String getDrugInteraction() {
        return drugInteraction;
    }

    public void setDrugInteraction(String drugInteraction) {
        this.drugInteraction = drugInteraction;
    }

    public String getDrugDosage() {
        return drugDosage;
    }

    public void setDrugDosage(String drugDosage) {
        this.drugDosage = drugDosage;
    }

    public String getShopRecommendation() {
        return shopRecommendation;
    }

    public void setShopRecommendation(String shopRecommendation) {
        this.shopRecommendation = shopRecommendation;
    }

    public String getWarningCount() {
        return warningCount;
    }

    public void setWarningCount(String warningCount) {
        this.warningCount = warningCount;
    }

    public String getFreightFree() {
        return freightFree;
    }

    public void setFreightFree(String freightFree) {
        this.freightFree = freightFree;
    }

    public String getAuditType() {
        return auditType;
    }

    public void setAuditType(String auditType) {
        this.auditType = auditType;
    }

    public String getIssuedStatus() {
        return issuedStatus;
    }

    public void setIssuedStatus(String issuedStatus) {
        this.issuedStatus = issuedStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getStocks() {
        return stocks;
    }

    public void setStocks(String stocks) {
        this.stocks = stocks;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDrugImg() {
        return drugImg;
    }

    public void setDrugImg(String drugImg) {
        this.drugImg = drugImg;
    }
}
