package com.adoumadje.springcore.injecting.interfaces.annotations;

import org.springframework.stereotype.Component;

@Component("dao2")
public class OrderDAOImpl2 implements OrderDAO {

    @Override
    public void createOder() {
        System.out.println("inside OrderDAOImpl2 createOder method");
    }
}
