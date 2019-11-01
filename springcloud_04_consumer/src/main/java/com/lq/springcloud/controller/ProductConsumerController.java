package com.lq.springcloud.controller;


import com.lq.springcloud.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.client.ServiceInstance;
//import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

@RestController
public class ProductConsumerController {


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/product/consumer/list")
    public List<Product> list(){
        return restTemplate.getForObject( "http://provider/product/list",List.class);
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
