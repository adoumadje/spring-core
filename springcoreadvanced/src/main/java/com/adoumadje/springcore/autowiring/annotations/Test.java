package com.adoumadje.springcore.autowiring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        String config = "com/adoumadje/springcore/autowiring/annotations/config.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        Employee employee = applicationContext.getBean("employee", Employee.class);
        System.out.println(employee);
    }
}
