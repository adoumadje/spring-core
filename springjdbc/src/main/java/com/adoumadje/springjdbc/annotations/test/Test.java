package com.adoumadje.springjdbc.annotations.test;



import com.adoumadje.springjdbc.annotations.dao.EmployeeDAO;
import com.adoumadje.springjdbc.annotations.dto.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        String config = "annotations/test/config.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        EmployeeDAO employeeDAO = applicationContext.getBean("employeeDAO", EmployeeDAO.class);

        Employee employee = new Employee();
        employee.setId(4);
        employee.setFirstname("Cole");
        employee.setLastname("Palmer");

//        int res = employeeDAO.create(employee);
//        System.out.println("Number of rows inserted = " + res);

//        int res = employeeDAO.update(employee);
//        System.out.println("Number of rows updated = " + res);
//
//        int res = employeeDAO.delete(employee);
//        System.out.println("Number of rows deleted = " + res);
//
//        Employee dbEmp = employeeDAO.read(3);
//        System.out.println(dbEmp);
//
        List<Employee> employees = employeeDAO.readAll();
        System.out.println(employees);
    }
}
