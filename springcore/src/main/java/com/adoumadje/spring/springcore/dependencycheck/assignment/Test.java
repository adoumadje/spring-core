package com.adoumadje.spring.springcore.dependencycheck.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        String pkg = "com.adoumadje.spring.springcore.dependencycheck.assignment".replace(".", "/");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(pkg+"/config.xml");
        University university = applicationContext.getBean("university", University.class);
        System.out.println(university + " - hashcode = " + university.hashCode());
        University university1 = applicationContext.getBean("university", University.class);
        System.out.println(university1 + " - hashcode = " + university1.hashCode());
    }
}
