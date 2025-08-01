package com.adoumadje.spring.springcore.lifecycle.annotationconfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        String pkg = "com.adoumadje.spring.springcore.lifecycle.annotationconfig".replace(".", "/");
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(pkg+"/config.xml");
        Patient patient = applicationContext.getBean("patient", Patient.class);
        System.out.println(patient);
        applicationContext.registerShutdownHook();
    }
}
