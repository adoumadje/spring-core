package com.adoumadje.springorm.assignment.dao;

import com.adoumadje.springorm.assignment.entity.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component("passengerDAO")
public class PassengerDAOImpl implements PassengerDAO {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Transactional
    @Override
    public void create(Passenger passenger) {
        hibernateTemplate.save(passenger);
    }

    @Transactional
    @Override
    public void update(Passenger passenger) {
        hibernateTemplate.update(passenger);
    }

    @Transactional
    @Override
    public void delete(Passenger passenger) {
        hibernateTemplate.delete(passenger);
    }

    @Transactional
    @Override
    public Passenger find(int id) {
        return hibernateTemplate.get(Passenger.class, id);
    }

    @Transactional
    @Override
    public List<Passenger> findAll() {
        return hibernateTemplate.loadAll(Passenger.class);
    }
}
