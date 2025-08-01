package com.adoumadje.spring.springcore.reftypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        String pkg = "com/adoumadje/spring/springcore/reftypes/";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(pkg+"config.xml");
        Student student = applicationContext.getBean("student", Student.class);
        System.out.println(student);
    }
}
