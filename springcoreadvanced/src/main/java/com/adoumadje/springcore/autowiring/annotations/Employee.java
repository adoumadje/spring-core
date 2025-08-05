package com.adoumadje.springcore.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

    @Autowired(required = false)
    @Qualifier("address1")
    private Address address;

    public Employee() {
    }

//    @Autowired
    public Employee(Address address) {
        System.out.println("param constructor called");
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

//    @Autowired
    public void setAddress(Address address) {
        System.out.println("inside setAddress method");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
