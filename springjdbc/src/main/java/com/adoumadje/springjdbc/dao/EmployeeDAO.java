package com.adoumadje.springjdbc.dao;

import com.adoumadje.springjdbc.dto.Employee;

import java.util.List;

public interface EmployeeDAO {
    int create(Employee employee);
    int update(Employee employee);
    int delete(Employee employee);
    Employee read(int id);
    List<Employee> readAll();
}
