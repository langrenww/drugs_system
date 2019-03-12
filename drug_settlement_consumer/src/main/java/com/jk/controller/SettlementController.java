package com.jk.controller;

import com.jk.pojo.BankCard;
import com.jk.pojo.Settlement;
import com.jk.pojo.Test;
import com.jk.service.SettlementServiceConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

}
