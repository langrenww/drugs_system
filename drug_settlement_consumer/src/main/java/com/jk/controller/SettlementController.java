package com.jk.controller;

import com.jk.pojo.*;
import com.jk.service.SettlementServiceConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

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
    public void saveBankCard(BankCard bankCard){
        settlementServiceConsumer.saveBankCard(bankCard);

    }

    /**
     * 查询结算申请和结算记录
     * 参数:根据订单号,商品名称,采购商,结算状态,进行条件查询
     * @param settlement
     */
    @GetMapping("querySettlement")
    @ResponseBody
    public HashMap<String, Object> querySettlement( Integer page,  Integer rows,  Settlement settlement){
     HashMap<String, Object> list=  settlementServiceConsumer.querySettlement(page,rows,settlement);
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

    /**
     * 查询下单量
     * @param orderCount
     * 参数对象属性：selectCountStatus：数量状态 0本月 7近七天 30近三十天 -1是自定义
     * 参数对象属性：startDate:自定义时开始时间
     * 参数对象属性：endDate:自定义时结束时间
     * @return
     */
    @GetMapping("queryOrderCount")
    @ResponseBody
    public List<OrderCount> queryOrderCount(OrderCount orderCount){
        return settlementServiceConsumer.queryOrderCount(orderCount);
    }

    /**
     * 查询成交量
     * @param orderCount
     * 参数对象属性：selectCountStatus：数量状态 0本月 7近七天 30近三十天 -1是自定义
     * 参数对象属性：startDate:自定义时开始时间
     * 参数对象属性：endDate:自定义时结束时间
     * @return
     */
    @GetMapping("querySuccessCount")
    @ResponseBody
    public List<OrderCount> querySuccessCount(OrderCount orderCount){
        return settlementServiceConsumer.querySuccessCount(orderCount);
    }

}
