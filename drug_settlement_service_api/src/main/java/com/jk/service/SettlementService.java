package com.jk.service;

import com.jk.pojo.*;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

public interface SettlementService {
    /**
     * 测试框架
     * @return
     */
    @GetMapping("test")
    List<Test> test();

    /**
     * 绑卡设置 添加银行卡
     * @param bankCard
     */
    @PostMapping("saveBankCard")
    void saveBankCard(BankCard bankCard);

    /**
     * 查询结算申请和结算记录
     * 参数:根据订单号,商品名称,采购商,结算状态,进行条件查询
     * @param settlement
     */
    @PostMapping("querySettlement")
    HashMap<String, Object> querySettlement(@RequestParam("page") Integer page,@RequestParam("rows") Integer rows,@RequestBody Settlement settlement);

    /**
     * 申请结算 将可结算状态改为出账中状态
     * @param id
     * 参数：传订单的主键
     */
    @PutMapping("applyettlement")
    void applyettlement(@RequestParam("id") Integer id);

    /**
     * 查询待结算，可体现，累计提现总金额
     * @return
     */
    @GetMapping("queryMoneySum")
    List<Money> queryMoneySum();

    /**
     * 查询下单量
     * @param orderCount
     * 参数对象属性：selectCountStatus：数量状态 0本月 7近七天 30近三十天 -1是自定义
     * 参数对象属性：startDate:自定义时开始时间
     * 参数对象属性：endDate:自定义时结束时间
     * @return
     */
    @PostMapping("queryOrderCount")
    List<OrderCount> queryOrderCount(OrderCount orderCount);


    /**
     * 查询成交量
     * @param orderCount
     * 参数对象属性：selectCountStatus：数量状态 0本月 7近七天 30近三十天 -1是自定义
     * 参数对象属性：startDate:自定义时开始时间
     * 参数对象属性：endDate:自定义时结束时间
     * @return
     */
    @PostMapping("querySuccessCount")
    List<OrderCount> querySuccessCount(OrderCount orderCount);
}
