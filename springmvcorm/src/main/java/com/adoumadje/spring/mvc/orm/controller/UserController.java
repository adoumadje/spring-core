package com.adoumadje.spring.mvc.orm.controller;

import com.adoumadje.spring.mvc.orm.entity.User;
import com.adoumadje.spring.mvc.orm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/registrationPage")
    public String showRegistrationPage() {
        return "registrationPage";
    }

    @RequestMapping(value = "/registerUser", method = RequestMethod.POST)
    public RedirectView registerUser(@ModelAttribute User user) {
        userService.registerUser(user);
        return new RedirectView("/springmvcorm/showAllUsers");
    }

    @RequestMapping("/showAllUsers")
    public String showAllUser(ModelMap model) {
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "allUsersPage";
    }
}
