package com.jk.service;

import com.jk.pojo.Test;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

public interface SettlementService {
    @GetMapping("test")
    List<Test> test();
}
