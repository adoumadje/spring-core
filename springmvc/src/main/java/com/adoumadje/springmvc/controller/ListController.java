package com.adoumadje.springmvc.controller;

import com.adoumadje.springmvc.dto.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ListController {
    @RequestMapping("/readList")
    public ModelAndView readList() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("readList");

        Employee employee = new Employee();
        employee.setId(456);
        employee.setName("Mamadou Sissoko");
        employee.setSalary(200_000);

        Employee employee1 = new Employee();
        employee1.setId(589);
        employee1.setName("Diego Milito");
        employee1.setSalary(300_000);

        Employee employee2 = new Employee();
        employee2.setId(632);
        employee2.setName("Wesley Sneijder");
        employee2.setSalary(150_000);

        modelAndView.addObject("employees", List.of(employee1, employee2, employee));
        return modelAndView;
    }
}
