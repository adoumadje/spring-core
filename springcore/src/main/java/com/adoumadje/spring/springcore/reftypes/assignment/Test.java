package com.adoumadje.spring.springcore.reftypes.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        String pkg = "com/adoumadje/spring/springcore/reftypes/assignment/";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(pkg+"config.xml");
        ShoppingCart shoppingCart = applicationContext.getBean("shoppingcart", ShoppingCart.class);
        System.out.println(shoppingCart);
    }
}
