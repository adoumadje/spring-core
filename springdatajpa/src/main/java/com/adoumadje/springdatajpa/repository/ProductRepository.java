package com.adoumadje.springdatajpa.repository;

import com.adoumadje.springdatajpa.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
