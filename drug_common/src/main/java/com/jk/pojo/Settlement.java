package com.jk.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Settlement {
    private Integer settlementId;//订单ID
    private String productPurchaser;//采购商
    private String productName;//采购商品
    private String commoditySpecification;//商品规格
    private Integer settlementCount;//购买数
    private Integer settlementPromotion;//促销
    private Integer settlementcommission;//推广佣金
    private Integer settlementStatus;//结算状态
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date applicationDate;//申请时间
    private Integer settlementAmount;//结算金额,应收总额
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date settlementDate;//结算时间
    private Integer actualReceipts;//实收款
    private Integer productSinglePrice;//单价

    public Integer getSettlementId() {
        return settlementId;
    }

    public void setSettlementId(Integer settlementId) {
        this.settlementId = settlementId;
    }

    public String getProductPurchaser() {
        return productPurchaser;
    }

    public void setProductPurchaser(String productPurchaser) {
        this.productPurchaser = productPurchaser;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCommoditySpecification() {
        return commoditySpecification;
    }

    public void setCommoditySpecification(String commoditySpecification) {
        this.commoditySpecification = commoditySpecification;
    }

    public Integer getSettlementCount() {
        return settlementCount;
    }

    public void setSettlementCount(Integer settlementCount) {
        this.settlementCount = settlementCount;
    }

    public Integer getSettlementPromotion() {
        return settlementPromotion;
    }

    public void setSettlementPromotion(Integer settlementPromotion) {
        this.settlementPromotion = settlementPromotion;
    }

    public Integer getSettlementcommission() {
        return settlementcommission;
    }

    public void setSettlementcommission(Integer settlementcommission) {
        this.settlementcommission = settlementcommission;
    }

    public Integer getSettlementStatus() {
        return settlementStatus;
    }

    public void setSettlementStatus(Integer settlementStatus) {
        this.settlementStatus = settlementStatus;
    }

    public Date getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }

    public Integer getSettlementAmount() {
        return settlementAmount;
    }

    public void setSettlementAmount(Integer settlementAmount) {
        this.settlementAmount = settlementAmount;
    }

    public Date getSettlementDate() {
        return settlementDate;
    }

    public void setSettlementDate(Date settlementDate) {
        this.settlementDate = settlementDate;
    }

    public Integer getActualReceipts() {
        return actualReceipts;
    }

    public void setActualReceipts(Integer actualReceipts) {
        this.actualReceipts = actualReceipts;
    }

    public Integer getProductSinglePrice() {
        return productSinglePrice;
    }

    public void setProductSinglePrice(Integer productSinglePrice) {
        this.productSinglePrice = productSinglePrice;
    }

    @Override
    public String toString() {
        return "Settlement{" +
                "settlementId=" + settlementId +
                ", productPurchaser='" + productPurchaser + '\'' +
                ", productName='" + productName + '\'' +
                ", commoditySpecification='" + commoditySpecification + '\'' +
                ", settlementCount=" + settlementCount +
                ", settlementPromotion=" + settlementPromotion +
                ", settlementcommission=" + settlementcommission +
                ", settlementStatus=" + settlementStatus +
                ", applicationDate=" + applicationDate +
                ", settlementAmount=" + settlementAmount +
                ", settlementDate=" + settlementDate +
                ", actualReceipts=" + actualReceipts +
                ", productSinglePrice=" + productSinglePrice +
                '}';
    }
}
