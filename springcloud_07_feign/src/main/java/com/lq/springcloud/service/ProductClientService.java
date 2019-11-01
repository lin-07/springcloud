package com.lq.springcloud.service;

import com.lq.springcloud.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "provider") //服务名
public interface ProductClientService {


    @GetMapping("/product/list")   //服务映射路径
    List<Product> list();
}
