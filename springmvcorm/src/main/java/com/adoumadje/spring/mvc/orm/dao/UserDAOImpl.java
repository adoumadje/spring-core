package com.adoumadje.spring.mvc.orm.dao;

import com.adoumadje.spring.mvc.orm.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDAOImpl implements UserDAO {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public int create(User user) {
        return (int) hibernateTemplate.save(user);
    }

    @Override
    public List<User> findAll() {
        return hibernateTemplate.loadAll(User.class);
    }

    @Override
    public User find(int id) {
        return hibernateTemplate.get(User.class, id);
    }
}
