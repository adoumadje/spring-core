package com.adoumadje.spring.springcore.lifecycle.assignment;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "TicketReservation{" +
                "id=" + id +
                '}';
    }

    @PostConstruct
    public void initialize() {
        System.out.println("inside initialize method");
    }

    @PreDestroy
    public void cleanUp() {
        System.out.println("inside cleanUp method");
    }
}
