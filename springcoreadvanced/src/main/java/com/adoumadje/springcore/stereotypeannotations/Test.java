package com.adoumadje.springcore.stereotypeannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        String config = "com/adoumadje/springcore/stereotypeannotations/config.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        Instructor instructor = applicationContext.getBean("instructor", Instructor.class);
        System.out.println(instructor);
    }
}
