package com.adoumadje.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        String pkg = "com/adoumadje/spring/springcore/properties/";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(pkg+"config.xml");
        CountryAndLanguage countryAndLangs = applicationContext.getBean("countryandlangs", CountryAndLanguage.class);
        System.out.println(countryAndLangs);
    }
}
