package com.adoumadje.spring.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        String pkg = "com.adoumadje.spring.springcore.constructorinjection".replace(".", "/");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(pkg+"/config.xml");
        Employee employee = applicationContext.getBean("employee", Employee.class);
        System.out.println(employee);
    }
}
