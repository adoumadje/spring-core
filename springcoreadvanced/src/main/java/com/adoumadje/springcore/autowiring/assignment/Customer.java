package com.adoumadje.springcore.autowiring.assignment;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
    private String name;
    private Reservation reservation;

    public Customer() {
    }

    @Autowired
    public Customer(String name, Reservation reservation) {
        System.out.println("param constructor called");
        this.name = name;
        this.reservation = reservation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", reservation=" + reservation +
                '}';
    }
}
