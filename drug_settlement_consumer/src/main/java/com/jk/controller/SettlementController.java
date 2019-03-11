package com.jk.controller;

import com.jk.pojo.BankCard;
import com.jk.pojo.Settlement;
import com.jk.pojo.Test;
import com.jk.service.SettlementServiceConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public void saveBankCard(@RequestBody BankCard bankCard){
        settlementServiceConsumer.saveBankCard(bankCard);

    }
    @GetMapping("querySettlement")
    @ResponseBody
    public List<Settlement> querySettlement(Settlement settlement){
       return  settlementServiceConsumer.querySettlement(settlement);
    }

}
