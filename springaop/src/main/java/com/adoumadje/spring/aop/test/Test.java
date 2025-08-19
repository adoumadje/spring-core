package com.adoumadje.spring.aop.test;

import com.adoumadje.spring.aop.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        String config = "com/adoumadje/spring/aop/test/config.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        ProductService productService = applicationContext.getBean(ProductService.class);
        System.out.println("3x4 = " + productService.multiply(3, 4));
    }
}
