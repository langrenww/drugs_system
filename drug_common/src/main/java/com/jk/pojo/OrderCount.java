package com.jk.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class OrderCount {
    private Integer orderCount;
    private Integer successCount;
    private Integer selectCountStatus; //数量状态 0本月 7近七天 30近三十天 -1是自定义
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date orderDate;
    //开始时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date    startDate;
    //结束时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date    endDate;

    public Integer getSelectCountStatus() {
        return selectCountStatus;
    }

    public void setSelectCountStatus(Integer selectCountStatus) {
        this.selectCountStatus = selectCountStatus;
    }

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public Integer getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "OrderCount{" +
                "orderCount=" + orderCount +
                ", successCount=" + successCount +
                ", selectCountStatus=" + selectCountStatus +
                ", orderDate=" + orderDate +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
