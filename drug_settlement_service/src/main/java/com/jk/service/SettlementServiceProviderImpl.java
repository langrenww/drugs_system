package com.jk.service;

import com.jk.dao.SettlementDao;
import com.jk.pojo.BankCard;
import com.jk.pojo.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SettlementServiceProviderImpl implements SettlementServiceProvider{
    @Autowired
    private SettlementDao settlementDao;
    @Override
    public List<Test> test() {
       return settlementDao.test();
    }

    @Override
    public void saveBankCard(BankCard bankCard) {
        settlementDao.saveBankCard(bankCard);
    }

}
