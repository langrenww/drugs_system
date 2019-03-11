package com.jk.service;

import org.springframework.web.bind.annotation.GetMapping;

public interface ProductServiceApi {
    @GetMapping
    void frameTest();
}
