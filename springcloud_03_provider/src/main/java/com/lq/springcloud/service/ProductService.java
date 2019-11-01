package com.lq.springcloud.service;

import com.lq.springcloud.pojo.Product;

import java.util.List;

public interface ProductService {

    Product findById(Long pid);

    List<Product> findAll();

    boolean addProduct(Product product);
}
