package com.adoumadje.springdatajpa;

import com.adoumadje.springdatajpa.entity.Product;
import com.adoumadje.springdatajpa.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class SpringdatajpaApplicationTests {
	@Autowired
	ProductRepository productRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void saveProduct() {
		Product product = new Product();
		product.setId(1L);
		product.setName("Mouse");
		product.setDescription("IT tool");
		product.setPrice(12.48);
		System.out.println(productRepository.save(product));
	}

	@Test
	void findProductById() {
		Optional<Product> optionalProduct = productRepository.findById(1L);
		optionalProduct.ifPresent(System.out::println);
	}

	@Test
	void findAllProducts() {
		productRepository.findAll().forEach(System.out::println);
	}
}
