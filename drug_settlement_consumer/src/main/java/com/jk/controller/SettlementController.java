package com.jk.controller;

import com.jk.pojo.*;
import com.jk.service.SettlementServiceConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class SettlementController {
    @Autowired
    private SettlementServiceConsumer settlementServiceConsumer;

    /**
     * 测试框架
     * @return
     */
    @GetMapping("test")
    @ResponseBody
    public List<Test> test(){
        List<Test> list=  settlementServiceConsumer.test();
       return  list;
    }

    /**
     * 绑卡设置 添加银行卡
     * @param bankCard
     */
    @PostMapping("saveBankCard")
    @ResponseBody
    public void saveBankCard(@RequestBody BankCard bankCard){
        settlementServiceConsumer.saveBankCard(bankCard);

    }

    /**
     * 查询结算申请和结算记录
     * 参数:根据订单号,商品名称,采购商,结算状态,进行条件查询
     * @param settlement
     */
    @GetMapping("querySettlement")
    @ResponseBody
    public List<Settlement> querySettlement(Settlement settlement){
     List<Settlement> list=  settlementServiceConsumer.querySettlement(settlement);
        return list;
    }

    /**
     * 申请结算 将可结算状态改为出账中状态
     * @param id
     * 参数：传订单的主键
     */
    @PutMapping("applyettlement")
    @ResponseBody
    public void applyettlement(@RequestParam("id") Integer id){
        settlementServiceConsumer.applyettlement(id);
    }

    /**
     * 查询 待结算，可体现，累计提现总金额
     * @return
     */
    @GetMapping("queryMoneySum")
    @ResponseBody
    public List<Money> queryMoneySum(){
        List<Money> list=settlementServiceConsumer.queryMoneySum();
        return list;
    }

    @GetMapping("queryOrderCount")
    @ResponseBody
    public List<OrderCount> queryOrderCount(OrderCount orderCount){
        return settlementServiceConsumer.queryOrderCount(orderCount);
    }

    @GetMapping("querySuccessCount")
    @ResponseBody
    public List<OrderCount> querySuccessCount(OrderCount orderCount){
        return settlementServiceConsumer.querySuccessCount(orderCount);
    }

}
