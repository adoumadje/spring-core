package com.adoumadje.spring.mvc.orm.dao;

import com.adoumadje.spring.mvc.orm.entity.User;

import java.util.List;

public interface UserDAO {
    int create(User user);
    List<User> findAll();
    User find(int id);
}
