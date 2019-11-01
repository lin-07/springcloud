package com.lq.springcloud.controller;


import com.lq.springcloud.pojo.Product;
import com.lq.springcloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product/list")
    public List<Product> findAll(){
        return productService.findAll();
    }

    @GetMapping("/product/get/{id}")
    public Product findById(@PathVariable("id") Long id){
        return productService.findById(id);
    }

    @PostMapping("/product/add")
    public Boolean add(Product product){
        return productService.addProduct(product);
    }
}
