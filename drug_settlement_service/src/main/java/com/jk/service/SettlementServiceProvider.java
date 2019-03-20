package com.jk.service;

import com.jk.pojo.*;

import java.util.HashMap;
import java.util.List;

public interface SettlementServiceProvider {
    List<Test> test();

    void saveBankCard(BankCard bankCard);

    HashMap<String, Object> querySettlement(Integer page, Integer rows, Settlement settlement);

    void applyettlement(Integer id);

    List<Money> queryMoneySum();

    List<OrderCount> queryOrderCount(OrderCount orderCount);

    List<OrderCount> querySuccessCount(OrderCount orderCount);

    HashMap<String, Object> queryMerchants(Integer page, Integer rows, AgencyAndMerchants agencyAndMerchants);

    List<District> queryProvince();

    List<Type> queryOneType();

    List<Type> queryType(Integer pid);

    HashMap<String, Object> queryAgency(Integer page, Integer rows, AgencyAndMerchants agencyAndMerchants);

    HashMap<String, Object> querySupply(Integer page, Integer rows, PurchaseAndSupply purchaseAndSupply);

    HashMap<String, Object> queryPurchase(Integer page, Integer rows, PurchaseAndSupply purchaseAndSupply);

    void saveSupplier(Supplier supplier);
}
