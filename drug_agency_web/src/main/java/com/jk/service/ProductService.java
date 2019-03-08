package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("agency-server")
public interface ProductService extends ProductServiceApi {
}
