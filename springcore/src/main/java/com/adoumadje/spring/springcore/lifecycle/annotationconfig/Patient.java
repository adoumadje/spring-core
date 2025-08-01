package com.adoumadje.spring.springcore.lifecycle.annotationconfig;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        System.out.println("inside setId method");
        this.id = id;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                '}';
    }

    @PostConstruct
    public void hi() {
        System.out.println("inside hi method");
    }

    @PreDestroy
    public void bye() {
        System.out.println("inside bye method");
    }
}
