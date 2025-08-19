package com.adoumadje.spring.mvc.orm.service;

import com.adoumadje.spring.mvc.orm.entity.User;

import java.util.List;

public interface UserService {
    int registerUser(User user);
    List<User> getAllUsers();
    User getUserById(int id);
}
