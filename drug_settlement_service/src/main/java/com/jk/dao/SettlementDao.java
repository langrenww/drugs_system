package com.jk.dao;

import com.jk.pojo.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SettlementDao {
    List<Test> test();

    void saveBankCard(BankCard bankCard);

    List<Settlement> querySettlement(@Param("start") Integer start, @Param("rows") Integer rows,  @Param("settlement") Settlement settlement);

    void applyettlement(Integer id);

    Long querysettlementMoney();

    Long querycashMoney();

    Long querycashTotalMoney();

    List<OrderCount> queryOrderCount(OrderCount orderCount);

    List<OrderCount> querySuccessCount(OrderCount orderCount);

    int findSettlementCount(@Param("settlement") Settlement settlement);

    int findMerchantsCount(@Param("agencyAndMerchants") AgencyAndMerchants agencyAndMerchants);

    List<AgencyAndMerchants> queryMerchants(@Param("start")int start, @Param("rows")Integer rows, @Param("agencyAndMerchants")AgencyAndMerchants agencyAndMerchants);

    List<District> queryProvince();

    List<Type> queryOneType();

    List<Type> queryType(Integer pid);

    int findAgencyCount(@Param("agencyAndMerchants")AgencyAndMerchants agencyAndMerchants);

    List<AgencyAndMerchants> queryAgency(@Param("start")int start, @Param("rows")Integer rows, @Param("agencyAndMerchants")AgencyAndMerchants agencyAndMerchants);

    int findSupplyCount(@Param("purchaseAndSupply")PurchaseAndSupply purchaseAndSupply);

    List<PurchaseAndSupply> querySupply(@Param("start")int start, @Param("rows")Integer rows, @Param("purchaseAndSupply")PurchaseAndSupply purchaseAndSupply);

    int findPurchaseCount(@Param("purchaseAndSupply")PurchaseAndSupply purchaseAndSupply);

    List<PurchaseAndSupply> queryPurchase(@Param("start")int start, @Param("rows")Integer rows, @Param("purchaseAndSupply")PurchaseAndSupply purchaseAndSupply);

    void saveSupplier(Supplier supplier);
}
