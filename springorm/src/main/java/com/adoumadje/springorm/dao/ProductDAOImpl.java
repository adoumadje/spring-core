package com.adoumadje.springorm.dao;

import com.adoumadje.springorm.entity.Product;

import java.util.List;

public class ProductDAOImpl implements ProductDAO {

    @Override
    public int create(Product product) {
        return 0;
    }

    @Override
    public int update(Product product) {
        return 0;
    }

    @Override
    public int delete(Product product) {
        return 0;
    }

    @Override
    public Product find(int id) {
        return null;
    }

    @Override
    public List<Product> findAll() {
        return List.of();
    }
}
