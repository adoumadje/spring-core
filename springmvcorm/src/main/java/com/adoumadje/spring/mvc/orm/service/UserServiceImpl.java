package com.adoumadje.spring.mvc.orm.service;

import com.adoumadje.spring.mvc.orm.dao.UserDAO;
import com.adoumadje.spring.mvc.orm.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Transactional
    @Override
    public int registerUser(User user) {
        return userDAO.create(user);
    }

    @Transactional
    @Override
    public List<User> getAllUsers() {
        return userDAO.findAll();
    }

    @Transactional
    @Override
    public User getUserById(int id) {
        return userDAO.find(id);
    }
}
