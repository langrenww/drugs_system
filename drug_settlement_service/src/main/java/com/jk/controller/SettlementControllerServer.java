package com.jk.controller;

import com.jk.pojo.Test;
import com.jk.service.SettlementService;
import com.jk.service.SettlementServiceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class SettlementControllerServer implements SettlementService {

    @Autowired
    private SettlementServiceProvider settlementServiceProvider;

    @GetMapping("test")
    @ResponseBody
    @Override
    public List<Test> test() {
        return settlementServiceProvider.test();
    }
}
