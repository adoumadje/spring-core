package com.adoumadje.spring.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Employee employee = applicationContext.getBean("emp", Employee.class);
        System.out.println(employee);
    }
}
