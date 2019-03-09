package com.jk.service;

import com.jk.pojo.BankCard;
import com.jk.pojo.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Map;

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
}
