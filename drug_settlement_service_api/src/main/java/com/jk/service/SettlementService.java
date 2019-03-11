package com.jk.service;

import com.jk.pojo.BankCard;
import com.jk.pojo.Settlement;
import com.jk.pojo.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
    List<Settlement> querySettlement(Settlement settlement);
}
