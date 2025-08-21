package com.adoumadje.springbootrest.repository;

import com.adoumadje.springbootrest.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
