package com.jk.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Settlement {
    private Integer settlementId;//主键
    private Integer orderId;//订单号
    private String productPurchaser;//采购商
    private String productName;//采购商品名称
    private String commoditySpecification;//商品规格
    private Integer productQuantity;//购买数
    private Integer settlementPromotion;//促销
    private Integer settlementcommission;//推广佣金
    private Integer settlementStatus;//结算状态  1待结算 2可结算 3出账中 4已出帐 5全部结算状态 6全部出账状态
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date applicationDate;//申请时间
    private Integer settlementAmount;//结算金额,应收总额
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date settlementDate;//结算时间
    private Integer actualReceipts;//实收款
    private Integer productSinglePrice;//单价


    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

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

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
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
                ", orderId=" + orderId +
                ", productPurchaser='" + productPurchaser + '\'' +
                ", productName='" + productName + '\'' +
                ", commoditySpecification='" + commoditySpecification + '\'' +
                ", productQuantity=" + productQuantity +
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