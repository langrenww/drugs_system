package com.jk.dao;

import com.jk.pojo.BankCard;
import com.jk.pojo.Test;

import java.util.List;

public interface SettlementDao {
    List<Test> test();

    void saveBankCard(BankCard bankCard);
}
