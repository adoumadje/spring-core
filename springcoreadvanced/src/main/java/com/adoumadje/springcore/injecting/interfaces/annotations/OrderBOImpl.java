package com.adoumadje.springcore.injecting.interfaces.annotations;

import com.adoumadje.springcore.injecting.interfaces.OrderBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bo")
public class OrderBOImpl implements OrderBO {
    @Autowired
    @Qualifier("dao")
    private OrderDAO dao;

    @Override
    public void placeOrder() {
        System.out.println("inside OrderBOImpl placeOrder method");
        dao.createOder();
    }

    public OrderDAO getDao() {
        return dao;
    }

    public void setDao(OrderDAO dao) {
        this.dao = dao;
    }
}
