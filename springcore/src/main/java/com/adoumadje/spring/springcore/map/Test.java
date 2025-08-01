package com.adoumadje.spring.springcore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        String pkg = "com/adoumadje/spring/springcore/map/";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(pkg+"config.xml");
        Customer customer = applicationContext.getBean("customer", Customer.class);
        System.out.println(customer);
        System.out.println(customer.getProducts().getClass());
    }
}
