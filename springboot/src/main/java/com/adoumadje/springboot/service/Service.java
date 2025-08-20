package com.adoumadje.springboot.service;

import com.adoumadje.springboot.dao.DAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {
    @Autowired
    private DAO dao;

    public void create() {
        System.out.println("inside Service create method");
        dao.save();
    }
}
