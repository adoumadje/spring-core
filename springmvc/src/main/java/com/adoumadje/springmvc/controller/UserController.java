package com.adoumadje.springmvc.controller;

import com.adoumadje.springmvc.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @RequestMapping("/registrationPage")
    public ModelAndView showRegistrationPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("registrationPage");
        return modelAndView;
    }

    @RequestMapping(value = "/registerUser", method = RequestMethod.POST)
    public ModelAndView registerUser(@ModelAttribute User user) {
        ModelAndView modelAndView = new ModelAndView();
        System.out.println(user);
        modelAndView.setViewName("registrationSuccessful");
        modelAndView.addObject("user", user);
        return modelAndView;
    }

    @RequestMapping("/employeeInfo")
    public ModelAndView employeeInfo(@RequestParam("id") Integer id, @RequestParam("name") String name,
                                     @RequestParam(value = "salary", required = false, defaultValue = "32") Integer salary) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("employeeInfo");

        modelAndView.addObject("id", id);
        modelAndView.addObject("name", name);
        modelAndView.addObject("salary", salary);

        return modelAndView;
    }
}
