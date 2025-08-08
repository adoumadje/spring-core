package com.adoumadje.springjdbc.test;

import com.adoumadje.springjdbc.dao.EmployeeDAO;
import com.adoumadje.springjdbc.dto.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        String config = "test/config.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        EmployeeDAO employeeDAO = applicationContext.getBean("employeeDAO", EmployeeDAO.class);
        Employee employee = new Employee();
        employee.setId(2);
        employee.setFirstname("Kylian");
        employee.setLastname("Mbappe");

//        int res = employeeDAO.create(employee);
//        System.out.println("Number of rows inserted = " + res);

//        int res = employeeDAO.update(employee);
//        System.out.println("Number of rows updated = " + res);

        int res = employeeDAO.delete(employee);
        System.out.println("Number of rows deleted = " + res);
    }
}
