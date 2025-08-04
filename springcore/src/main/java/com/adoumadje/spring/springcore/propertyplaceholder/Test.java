package com.adoumadje.spring.springcore.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        String pkg = "com.adoumadje.spring.springcore.propertyplaceholder".replace(".", "/");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(pkg + "/config.xml");
        MyDAO myDAO = applicationContext.getBean("myDAO", MyDAO.class);
        System.out.println(myDAO);
    }
}
