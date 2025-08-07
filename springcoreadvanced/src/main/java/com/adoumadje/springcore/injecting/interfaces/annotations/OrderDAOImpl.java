package com.adoumadje.springcore.injecting.interfaces.annotations;

import org.springframework.stereotype.Component;

@Component("dao")
public class OrderDAOImpl implements OrderDAO {

    @Override
    public void createOder() {
        System.out.println("inside OrderDAOImpl createOder method");
    }
}
