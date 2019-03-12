package com.jk.service;

import com.jk.dao.SettlementDao;
import com.jk.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.ArrayList;
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

    @Override
    public List<Settlement> querySettlement(Settlement settlement) {
        return settlementDao.querySettlement(settlement);
    }

    @Override
    public void applyettlement(Integer id) {
        settlementDao.applyettlement(id);
    }

    @Override
    public List<Money> queryMoneySum() {
        List<Money> list =new ArrayList<>();
        Money money=new Money();
         //查询所有待结算金额
        Long  settlement= settlementDao.querysettlementMoney();
        //查询所有可体现金额
        Long cashMoney=settlementDao.querycashMoney();
        //查询累计提现总金额
        Long cashTotalMoney =settlementDao.querycashTotalMoney();

        money.setSettlement(settlement);
        money.setCashMoney(cashMoney);
        money.setCashTotalMoney(cashTotalMoney);

        list.add(money);
        return list;
    }

    @Override
    public List<OrderCount> queryOrderCount(OrderCount orderCount) {
        return settlementDao.queryOrderCount(orderCount);
    }

    @Override
    public List<OrderCount> querySuccessCount(OrderCount orderCount) {
        return settlementDao.querySuccessCount(orderCount);
    }

}
