package com.adoumadje.springboot.dao;

import org.springframework.stereotype.Component;

@Component
public class DAO {
    public void save() {
        System.out.println("inside DAO save method");
    }
}
