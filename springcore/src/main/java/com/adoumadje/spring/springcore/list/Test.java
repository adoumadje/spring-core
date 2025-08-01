package com.adoumadje.spring.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        String pkg = "com/adoumadje/spring/springcore/list/";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(pkg+"config.xml");
        Hospital hospital = applicationContext.getBean("hospital", Hospital.class);
        System.out.println(hospital);
        System.out.println(hospital.getDepartments().getClass());
    }
}
