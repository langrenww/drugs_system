package com.jk.pojo;

public class BankCard {
    private Integer  bankId;             //主键
    private String   bankName;           //开户银行
    private Integer  bankCardNumber;     //银行卡号
    private Integer  paymentPassword;    //支付密码
    private String  cardholderName;     //持卡人
    private Integer   phoneNumber;        //手机号

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Integer getBankCardNumber() {
        return bankCardNumber;
    }

    public void setBankCardNumber(Integer bankCardNumber) {
        this.bankCardNumber = bankCardNumber;
    }

    public Integer getPaymentPassword() {
        return paymentPassword;
    }

    public void setPaymentPassword(Integer paymentPassword) {
        this.paymentPassword = paymentPassword;
    }

    public String getCardholderName() {
        return cardholderName;
    }

    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "BankCard{" +
                "bankId=" + bankId +
                ", bankName='" + bankName + '\'' +
                ", bankCardNumber=" + bankCardNumber +
                ", paymentPassword=" + paymentPassword +
                ", cardholderName=" + cardholderName +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
