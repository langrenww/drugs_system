package com.jk.service;

import com.jk.pojo.*;

import java.util.List;

public interface SettlementServiceProvider {
    List<Test> test();

    void saveBankCard(BankCard bankCard);

    List<Settlement> querySettlement(Settlement settlement);

    void applyettlement(Integer id);

    List<Money> queryMoneySum();

    List<OrderCount> queryOrderCount(OrderCount orderCount);

    List<OrderCount> querySuccessCount(OrderCount orderCount);
}
