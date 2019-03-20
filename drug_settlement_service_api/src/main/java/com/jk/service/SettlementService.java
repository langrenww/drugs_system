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

    /**
     * 查询招商信息
     * @param page
     * @param rows
     * @param agencyAndMerchants
     * @return
     */
    @PostMapping("queryMerchants")
    HashMap<String, Object> queryMerchants(@RequestParam("page") Integer page,@RequestParam("rows") Integer rows, @RequestBody AgencyAndMerchants agencyAndMerchants);
    /**
     * 查询省区域
     * @return
     */
    @GetMapping("queryProvince")
    List<District> queryProvince();

    /**
     * 查询一级分类
     * @return
     */
    @GetMapping("queryOneType")
    List<Type> queryOneType();

    /**
     * 根据父id查询二级和三级分类
     * @return
     */
    @PostMapping("queryType")
    List<Type> queryType(@RequestParam("pid")Integer pid);

    /**
     * 查询代理信息
     * @param page
     * @param rows
     * @param agencyAndMerchants
     * @return
     */
    @PostMapping("queryAgency")
    HashMap<String, Object> queryAgency(@RequestParam("page") Integer page,@RequestParam("rows") Integer rows, @RequestBody AgencyAndMerchants agencyAndMerchants);

    /**
     * 查询供应信息
     * @param page
     * @param rows
     * @param purchaseAndSupply
     * @return
     */
    @PostMapping("querySupply")
    HashMap<String, Object> querySupply(@RequestParam("page") Integer page,@RequestParam("rows") Integer rows, @RequestBody PurchaseAndSupply purchaseAndSupply);

    /**
     * 查询求购信息
     * @param page
     * @param rows
     * @param purchaseAndSupply
     * @return
     */
    @PostMapping("queryPurchase")
    HashMap<String, Object> queryPurchase(@RequestParam("page") Integer page,@RequestParam("rows") Integer rows, @RequestBody PurchaseAndSupply purchaseAndSupply);

    /**
     * 申请成为供应商
     * @param supplier
     */
    @PostMapping("saveSupplier")
    void saveSupplier(Supplier supplier);
}
