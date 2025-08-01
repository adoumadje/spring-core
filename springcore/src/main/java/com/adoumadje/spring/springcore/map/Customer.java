package com.adoumadje.spring.springcore.map;

import java.util.Map;

public class Customer {
    private Long id;
    private Map<Integer, String> products;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Map<Integer, String> getProducts() {
        return products;
    }

    public void setProducts(Map<Integer, String> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", products=" + products +
                '}';
    }
}
