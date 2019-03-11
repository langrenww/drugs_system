package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients //识别项目中的feignClient注解
public class DrugSupplierCustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DrugSupplierCustomerApplication.class, args);
    }

}