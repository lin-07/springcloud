package com.lq.springcloud.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Product implements Serializable {

    private Long pid;
    private String productName;
    private String dbSource;
}
