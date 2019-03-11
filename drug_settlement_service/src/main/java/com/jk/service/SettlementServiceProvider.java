package com.jk.service;

import com.jk.pojo.BankCard;
import com.jk.pojo.Settlement;
import com.jk.pojo.Test;

import java.util.List;

public interface SettlementServiceProvider {
    List<Test> test();

    void saveBankCard(BankCard bankCard);

    List<Settlement> querySettlement(Settlement settlement);
}
