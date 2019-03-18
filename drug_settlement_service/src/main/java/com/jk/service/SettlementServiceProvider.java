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
}
