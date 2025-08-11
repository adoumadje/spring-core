package com.adoumadje.springorm.dao;

import com.adoumadje.springorm.entity.Product;

import java.util.List;

public interface ProductDAO {
    int create(Product product);
    int update(Product product);
    int delete(Product product);
    Product find(int id);
    List<Product> findAll();
}
