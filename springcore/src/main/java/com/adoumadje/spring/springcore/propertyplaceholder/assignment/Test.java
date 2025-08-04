package com.adoumadje.spring.springcore.propertyplaceholder.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        String config = "com/adoumadje/spring/springcore/propertyplaceholder/assignment/config.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        WebServiceClient webServiceClient = applicationContext.getBean("webServiceClient", WebServiceClient.class);
        System.out.println(webServiceClient);
    }
}
