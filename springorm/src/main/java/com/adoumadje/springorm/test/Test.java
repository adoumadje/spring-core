package com.adoumadje.springorm.test;

import com.adoumadje.springorm.dao.ProductDAO;
import com.adoumadje.springorm.entity.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        String config = "com/adoumadje/springorm/test/config.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        ProductDAO productDAO = applicationContext.getBean("productDAO", ProductDAO.class);

//        Product product = new Product();
//        product.setId(1);
//        product.setName("Mouse");
//        product.setDescription("IT Device");
//        product.setPrice(219.99);

//        productDAO.create(product);
//        productDAO.update(product);
//        productDAO.delete(product);

//        Product product = productDAO.find(1);
//        System.out.println(product);

        List<Product> products = productDAO.findAll();
        System.out.println(products);
    }
}
