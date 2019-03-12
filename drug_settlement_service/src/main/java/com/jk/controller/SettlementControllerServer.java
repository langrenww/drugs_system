package com.jk.controller;

import com.jk.pojo.*;
import com.jk.service.SettlementService;
import com.jk.service.SettlementServiceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class SettlementControllerServer implements SettlementService {

    @Autowired
    private SettlementServiceProvider settlementServiceProvider;

    /**
     * 测试框架
     * @return
     */
    @GetMapping("test")
    @ResponseBody
    @Override
    public List<Test> test() {
        return settlementServiceProvider.test();
    }

    /**
     * 绑卡设置 添加银行卡
     * @param bankCard
     */
    @PostMapping("saveBankCard")
    @ResponseBody
    @Override
    public void saveBankCard(@RequestBody BankCard bankCard) {
        settlementServiceProvider.saveBankCard(bankCard);
    }
    /**
     * 查询结算申请和结算记录
     * 参数:根据订单号,商品名称,采购商,结算状态,进行条件查询
     * @param settlement
     */
    @PostMapping("querySettlement")
    @ResponseBody
    @Override
    public List<Settlement> querySettlement(@RequestBody Settlement settlement) {
        return settlementServiceProvider.querySettlement(settlement);
    }
    /**
     * 申请结算 将可结算状态改为出账中状态
     * @param id
     * 参数：传订单的主键
     */
    @PutMapping("applyettlement")
    @ResponseBody
    @Override
    public void applyettlement(@RequestParam("id") Integer id) {
        settlementServiceProvider.applyettlement(id);
    }

    /**
     * 查询 待结算，可体现，累计提现总金额
     * @return
     */
    @GetMapping("queryMoneySum")
    @ResponseBody
    @Override
    public List<Money> queryMoneySum() {
        return settlementServiceProvider.queryMoneySum();
    }

    @PostMapping("queryOrderCount")
    @ResponseBody
    @Override
    public List<OrderCount> queryOrderCount(@RequestBody  OrderCount orderCount) {
        return settlementServiceProvider.queryOrderCount(orderCount);
    }
    @PostMapping("querySuccessCount")
    @ResponseBody
    @Override
    public List<OrderCount> querySuccessCount(@RequestBody  OrderCount orderCount) {
        return settlementServiceProvider.querySuccessCount(orderCount);
    }
}
