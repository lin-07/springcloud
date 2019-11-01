package com.lq.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
//@EnableDiscoveryClient
@EnableEurekaClient // 标识是一个eureka的客户端
@SpringBootApplication
public class ProviderApplication_02 {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication_02.class,args);
    }
}
