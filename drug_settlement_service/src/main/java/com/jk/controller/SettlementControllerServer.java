package com.jk.controller;

import com.jk.pojo.*;
import com.jk.service.SettlementService;
import com.jk.service.SettlementServiceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
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
    public HashMap<String, Object> querySettlement(@RequestParam("page")Integer page, @RequestParam("rows")Integer rows, @RequestBody Settlement settlement) {
        return settlementServiceProvider.querySettlement(page,rows,settlement);
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

    /**
     * 查询下单量
     * @param orderCount
     * 参数对象属性：selectCountStatus：数量状态 0本月 7近七天 30近三十天 -1是自定义
     * 参数对象属性：startDate:自定义时开始时间
     * 参数对象属性：endDate:自定义时结束时间
     * @return
     */
    @PostMapping("queryOrderCount")
    @ResponseBody
    @Override
    public List<OrderCount> queryOrderCount(@RequestBody  OrderCount orderCount) {
        return settlementServiceProvider.queryOrderCount(orderCount);
    }

    /**
     * 查询成交量
     * @param orderCount
     * 参数对象属性：selectCountStatus：数量状态 0本月 7近七天 30近三十天 -1是自定义
     * 参数对象属性：startDate:自定义时开始时间
     * 参数对象属性：endDate:自定义时结束时间
     * @return
     */
    @PostMapping("querySuccessCount")
    @ResponseBody
    @Override
    public List<OrderCount> querySuccessCount(@RequestBody  OrderCount orderCount) {
        return settlementServiceProvider.querySuccessCount(orderCount);
    }
}
