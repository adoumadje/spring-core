package com.adoumadje.springjdbc.xml.dao;

import com.adoumadje.springjdbc.xml.dto.Employee;

import java.util.List;

public interface EmployeeDAO {
    int create(Employee employee);
    int update(Employee employee);
    int delete(Employee employee);
    Employee read(int id);
    List<Employee> readAll();
}
