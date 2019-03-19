package com.jk.service;

import com.jk.dao.SettlementDao;
import com.jk.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class SettlementServiceProviderImpl implements SettlementServiceProvider{
    @Autowired
    private SettlementDao settlementDao;

    @Autowired
    private HttpSession session;

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

    @Override
    public HashMap<String, Object> queryMerchants(Integer page, Integer rows, AgencyAndMerchants agencyAndMerchants) {
        HashMap<String, Object> hashMap = new HashMap<>();
        //查询总条数
        int total = settlementDao.findMerchantsCount(agencyAndMerchants);
        //分页查询
        int start = (page-1)*rows;//开始条数
          List<AgencyAndMerchants> list = settlementDao.queryMerchants(start, rows, agencyAndMerchants);
        hashMap.put("total", total);
        hashMap.put("rows", list);
        return hashMap;
    }

    @Override
    public List<District> queryProvince() {
        return settlementDao.queryProvince();
    }

    @Override
    public List<Type> queryOneType() {
        return settlementDao.queryOneType();
    }

    @Override
    public List<Type> queryType(Integer pid) {
        if(pid!=null && pid!=0){
        return settlementDao.queryType(pid);
        }else{return null;}
    }

    @Override
    public HashMap<String, Object> queryAgency(Integer page, Integer rows, AgencyAndMerchants agencyAndMerchants) {

        HashMap<String, Object> hashMap = new HashMap<>();
        //查询总条数
        int total = settlementDao.findAgencyCount(agencyAndMerchants);
        //分页查询
        int start = (page-1)*rows;//开始条数
        List<AgencyAndMerchants> list = settlementDao.queryAgency(start, rows, agencyAndMerchants);
        hashMap.put("total", total);
        hashMap.put("rows", list);
        return hashMap;
    }

    @Override
    public HashMap<String, Object> querySupply(Integer page, Integer rows, PurchaseAndSupply purchaseAndSupply) {
        HashMap<String, Object> hashMap = new HashMap<>();
        //查询总条数
        int total = settlementDao.findSupplyCount(purchaseAndSupply);
        //分页查询
        int start = (page-1)*rows;//开始条数
        List<PurchaseAndSupply> list = settlementDao.querySupply(start, rows, purchaseAndSupply);
        Object user = session.getAttribute("user");
        if(user==null){
            for(PurchaseAndSupply purchaseAndSupply2:list){
                purchaseAndSupply2.setContactNumber("请登陆查看");
            }
        }
        hashMap.put("total", total);
        hashMap.put("rows", list);
        return hashMap;
    }

    @Override
    public HashMap<String, Object> queryPurchase(Integer page, Integer rows, PurchaseAndSupply purchaseAndSupply) {
        HashMap<String, Object> hashMap = new HashMap<>();
        //查询总条数
        int total = settlementDao.findPurchaseCount(purchaseAndSupply);
        //分页查询
        int start = (page-1)*rows;//开始条数
        List<PurchaseAndSupply> list = settlementDao.queryPurchase(start, rows, purchaseAndSupply);
        Object user = session.getAttribute("user");
        if(user==null){
            for(PurchaseAndSupply purchaseAndSupply2:list){
                purchaseAndSupply2.setManufacturer("请登陆查看");
            }
        }
        hashMap.put("total", total);
        hashMap.put("rows", list);
        return hashMap;
    }

}
