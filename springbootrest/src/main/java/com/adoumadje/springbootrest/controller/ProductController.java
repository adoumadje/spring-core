package com.adoumadje.springbootrest.controller;

import com.adoumadje.springbootrest.entity.Product;
import com.adoumadje.springbootrest.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @PostMapping("/product")
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        Product savedProduct = productRepository.save(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedProduct);
    }

    @PatchMapping("/product")
    public ResponseEntity<Product> updateProduct(@RequestBody Product product) {
        Product updatedProduct = productRepository.save(product);
        return ResponseEntity.status(HttpStatus.OK).body(updatedProduct);
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") Long id) {
        Product product = productRepository.findById(id).orElse(null);
        return ResponseEntity.status(HttpStatus.OK).body(product);
    }

    @DeleteMapping("/product/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable("id") Long id) {
        productRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body("Deleted Successfully...");
    }
}
