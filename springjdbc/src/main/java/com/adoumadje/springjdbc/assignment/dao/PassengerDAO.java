package com.adoumadje.springjdbc.assignment.dao;

import com.adoumadje.springjdbc.assignment.dto.Passenger;

import java.util.List;

public interface PassengerDAO {
    int create(Passenger passenger);
    int update(Passenger passenger);
    int delete(Passenger passenger);
    Passenger read(int id);
    List<Passenger> readAll();
}
