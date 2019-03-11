package com.jk.controller;

import com.jk.pojo.Test;
import com.jk.service.SettlementServiceConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class SettlementController {
    @Autowired
    private SettlementServiceConsumer settlementServiceConsumer;

    @GetMapping("test")
    @ResponseBody
    public List<Test> test(){
        List<Test> list=  settlementServiceConsumer.test();
       return  list;
    }

}
