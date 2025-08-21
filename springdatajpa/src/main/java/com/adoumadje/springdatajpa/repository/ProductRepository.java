package com.adoumadje.springdatajpa.repository;

import com.adoumadje.springdatajpa.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {
    List<Product> findByName(String name);
    List<Product> findByNameAndPrice(String name, Double price);
}
