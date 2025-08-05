package com.adoumadje.springcore.standalonecollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        String config = "com/adoumadje/springcore/standalonecollections/config.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        ProdutsList produtsList = applicationContext.getBean("productsList", ProdutsList.class);
        System.out.println(produtsList);
    }
}
