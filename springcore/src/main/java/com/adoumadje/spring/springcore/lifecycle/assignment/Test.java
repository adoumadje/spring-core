package com.adoumadje.spring.springcore.lifecycle.assignment;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        String pkg = "com.adoumadje.spring.springcore.lifecycle.assignment".replace(".", "/");
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(pkg+"/config.xml");
        TicketReservation ticketReservation = applicationContext.getBean("ticketReservation", TicketReservation.class);
        System.out.println(ticketReservation);
        applicationContext.registerShutdownHook();
    }
}
