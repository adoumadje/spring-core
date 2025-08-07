package com.adoumadje.springcore.injecting.interfaces;

public class OrderDAOImpl implements OrderDAO {
    @Override
    public void createOrder() {
        System.out.println("inside OrderDAOImpl createOrder method");
    }
}
