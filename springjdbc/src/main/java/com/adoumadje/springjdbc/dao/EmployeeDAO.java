package com.adoumadje.springjdbc.dao;

import com.adoumadje.springjdbc.dto.Employee;

public interface EmployeeDAO {
    int create(Employee employee);
    int update(Employee employee);
    int delete(Employee employee);
}
