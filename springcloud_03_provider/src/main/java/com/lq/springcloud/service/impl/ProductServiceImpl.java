package com.lq.springcloud.service.impl;

import com.lq.springcloud.mapper.ProductMapper;
import com.lq.springcloud.pojo.Product;
import com.lq.springcloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public Product findById(Long pid) {
        return productMapper.findById(pid);
    }

    @Override
    public List<Product> findAll() {
        return productMapper.findAll();
    }

    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
    @Override
    public boolean addProduct(Product product) {
        return productMapper.addProduct(product);
    }
}
