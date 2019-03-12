package com.jk.pojo;

public class Money {
    private Long settlement;//待结算
    private Long cashMoney; //可提现
    private Long cashTotalMoney;//累计提现总金额


    public Long getCashTotalMoney() {
        return cashTotalMoney;
    }

    public void setCashTotalMoney(Long cashTotalMoney) {
        this.cashTotalMoney = cashTotalMoney;
    }

    public Long getSettlement() {
        return settlement;
    }

    public void setSettlement(Long settlement) {
        this.settlement = settlement;
    }

    public Long getCashMoney() {
        return cashMoney;
    }

    public void setCashMoney(Long cashMoney) {
        this.cashMoney = cashMoney;

    }
    @Override
    public String toString() {
        return "Money{" +
                "settlement=" + settlement +
                ", cashMoney=" + cashMoney +
                ", cashTotalMoney=" + cashTotalMoney +
                '}';
    }
}
