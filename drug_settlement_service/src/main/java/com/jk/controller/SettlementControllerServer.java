package com.jk.controller;

import com.jk.pojo.BankCard;
import com.jk.pojo.Settlement;
import com.jk.pojo.Test;
import com.jk.service.SettlementService;
import com.jk.service.SettlementServiceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

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
    @PostMapping("querySettlement")
    @ResponseBody
    @Override
    public List<Settlement> querySettlement(@RequestBody Settlement settlement) {
        return settlementServiceProvider.querySettlement(settlement);
    }
}
