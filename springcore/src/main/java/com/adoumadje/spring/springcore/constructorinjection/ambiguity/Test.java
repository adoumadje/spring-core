package com.adoumadje.spring.springcore.constructorinjection.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        String pkg = "com.adoumadje.spring.springcore.constructorinjection.ambiguity".replace(".", "/");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(pkg+"/config.xml");
        Addition addition = applicationContext.getBean("addition", Addition.class);
    }
}
