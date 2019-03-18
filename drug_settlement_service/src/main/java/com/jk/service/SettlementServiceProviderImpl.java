package com.jk.service;

import com.jk.dao.SettlementDao;
import com.jk.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
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
    public HashMap<String, Object> querySettlement(Integer page, Integer rows, Settlement settlement) {
        HashMap<String, Object> hashMap = new HashMap<>();
        //查询总条数
        int total = settlementDao.findSettlementCount(settlement);
        //分页查询
        int start = (page-1)*rows;//开始条数
        List<Settlement> list = settlementDao.querySettlement(start, rows, settlement);
        hashMap.put("total", total);
        hashMap.put("rows", list);
        return hashMap;

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
