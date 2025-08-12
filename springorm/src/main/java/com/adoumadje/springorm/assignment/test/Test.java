package com.adoumadje.springorm.assignment.test;

import com.adoumadje.springorm.assignment.dao.PassengerDAO;
import com.adoumadje.springorm.assignment.entity.Passenger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        String conf = "com/adoumadje/springorm/assignment/test/config.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(conf);
        PassengerDAO passengerDAO = applicationContext.getBean("passengerDAO", PassengerDAO.class);

//        Passenger passenger = new Passenger();
//        passenger.setId(1);
//        passenger.setFirstname("Dani");
//        passenger.setLastname("Alves");

//        passengerDAO.create(passenger);
//        passengerDAO.update(passenger);
//        passengerDAO.delete(passenger);

//        Passenger passenger = passengerDAO.find(2);
//        System.out.println(passenger);

        List<Passenger> passengers = passengerDAO.findAll();
        System.out.println(passengers);
    }
}
