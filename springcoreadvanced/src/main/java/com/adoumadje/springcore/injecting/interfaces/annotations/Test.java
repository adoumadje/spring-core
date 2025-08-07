package com.adoumadje.springcore.injecting.interfaces.annotations;

import com.adoumadje.springcore.injecting.interfaces.OrderBO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        String config = "com/adoumadje/springcore/injecting/interfaces/annotations/config.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        OrderBO bo = applicationContext.getBean("bo", OrderBO.class);
        bo.placeOrder();
    }
}
