package com.adoumadje.springcore.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        String config = "com/adoumadje/springcore/injecting/interfaces/config.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        OrderBO bo = applicationContext.getBean("bo", OrderBO.class);
        bo.placeOrder();
    }
}
