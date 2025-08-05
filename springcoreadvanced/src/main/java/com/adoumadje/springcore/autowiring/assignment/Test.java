package com.adoumadje.springcore.autowiring.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        String config = "com/adoumadje/springcore/autowiring/assignment/config.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        Customer customer = applicationContext.getBean("customer", Customer.class);
        System.out.println(customer);
    }
}
