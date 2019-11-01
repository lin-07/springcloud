package com.lq.springcloud.controller;


import com.lq.springcloud.pojo.Product;
import com.lq.springcloud.service.ProductClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

//import org.springframework.cloud.client.ServiceInstance;
//import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;

@RestController
public class ProductConsumerController {


    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ProductClientService productClientService;

    @GetMapping("/product/consumer/list")
    public List<Product> list(){
//        return restTemplate.getForObject( "http://provider/product/list",List.class);
        return productClientService.list();
    }



//    @Autowired
//    private LoadBalancerClient loadBalancerClient;


//    @GetMapping("/product/consumer/list")
//    public List<Product> list(){
//        ServiceInstance serviceInstance = loadBalancerClient.choose("nacos-provider");
//        System.out.println(serviceInstance.getUri());
//
//        return restTemplate.getForObject(getURL() + "/product/list",List.class);
//    }

//    @GetMapping("/product/consumer/get/{id}")
//    public Product findById(@PathVariable("id") Long id){
//        return restTemplate.getForObject(getURL() + "/product/get/" + id,Product.class);
//    }


//    private URI getURL(){
//        return loadBalancerClient.choose("nacos-provider").getUri();
//    }
}
