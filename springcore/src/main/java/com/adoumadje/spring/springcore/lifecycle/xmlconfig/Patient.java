package com.adoumadje.spring.springcore.lifecycle.xmlconfig;

public class Patient {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        System.out.println("inside setId method");
        this.id = id;
    }

    public void hi() {
        System.out.println("inside hi method");
    }

    public void bye() {
        System.out.println("inside bye method");
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                '}';
    }
}
