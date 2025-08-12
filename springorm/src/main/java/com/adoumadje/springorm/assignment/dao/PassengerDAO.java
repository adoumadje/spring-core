package com.adoumadje.springorm.assignment.dao;

import com.adoumadje.springorm.assignment.entity.Passenger;

import java.util.List;

public interface PassengerDAO {
    void create(Passenger passenger);
    void update(Passenger passenger);
    void delete(Passenger passenger);
    Passenger find(int id);
    List<Passenger> findAll();
}
