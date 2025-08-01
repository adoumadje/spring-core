package com.adoumadje.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        String pkg = "com/adoumadje/spring/springcore/set/";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(pkg+"config.xml");
        CarDealer carDealer = applicationContext.getBean("cardealer", CarDealer.class);
        System.out.println(carDealer);
        System.out.println(carDealer.getModels().getClass());
    }
}
