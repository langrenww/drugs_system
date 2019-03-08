package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("service-order")//声明为feig客户端 指明要调用的服务
public interface CustomerServiceFegin extends  SupplierApi{
}
