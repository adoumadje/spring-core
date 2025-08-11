package com.adoumadje.springjdbc.assignment.test;

import com.adoumadje.springjdbc.assignment.dao.PassengerDAO;
import com.adoumadje.springjdbc.assignment.dto.Passenger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        String config =  "assignment/test/config.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        PassengerDAO passengerDAO = applicationContext.getBean("passengerDAO", PassengerDAO.class);

        Passenger passenger = new Passenger();
        passenger.setId(4);
        passenger.setFirstname("Valere");
        passenger.setLastname("Germain");

//        int res = passengerDAO.create(passenger);
//        System.out.println("Number of rows inserted = " + res);

//        int res = passengerDAO.update(passenger);
//        System.out.println("Number of rows updated = " + res);

//        int res = passengerDAO.delete(passenger);
//        System.out.println("Number of rows deleted = " + res);

//        Passenger dbPassenger = passengerDAO.read(1);
//        System.out.println(dbPassenger);

        List<Passenger> passengers = passengerDAO.readAll();
        System.out.println(passengers);
    }
}
