package com.adoumadje.springmvc.controller;

import com.adoumadje.springmvc.dto.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ObjectController {
    @RequestMapping("/readObject")
    public ModelAndView readObject() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("readObject");

        Employee employee = new Employee();
        employee.setId(123);
        employee.setName("Marcus Rashford");
        employee.setSalary(100_000);

        modelAndView.addObject("employee", employee);
        return modelAndView;
    }
}
