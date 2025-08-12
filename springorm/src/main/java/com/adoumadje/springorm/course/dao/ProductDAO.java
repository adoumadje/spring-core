package com.adoumadje.springorm.course.dao;

import com.adoumadje.springorm.course.entity.Product;

import java.util.List;

public interface ProductDAO {
    void create(Product product);
    void update(Product product);
    void delete(Product product);
    Product find(int id);
    List<Product> findAll();
}
