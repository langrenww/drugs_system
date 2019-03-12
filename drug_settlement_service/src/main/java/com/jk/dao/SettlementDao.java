package com.jk.dao;

import com.jk.pojo.BankCard;
import com.jk.pojo.OrderCount;
import com.jk.pojo.Settlement;
import com.jk.pojo.Test;

import java.util.List;
import java.util.Map;

public interface SettlementDao {
    List<Test> test();

    void saveBankCard(BankCard bankCard);

    List<Settlement> querySettlement(Settlement settlement);

    void applyettlement(Integer id);

    Long querysettlementMoney();

    Long querycashMoney();

    Long querycashTotalMoney();

    List<OrderCount> queryOrderCount(OrderCount orderCount);

    List<OrderCount> querySuccessCount(OrderCount orderCount);
}
