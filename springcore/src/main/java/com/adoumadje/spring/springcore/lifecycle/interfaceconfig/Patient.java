package com.adoumadje.spring.springcore.lifecycle.interfaceconfig;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        System.out.println("inside setId method");
        this.id = id;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("inside afterPropertiesSet method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("inside destroy method");
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                '}';
    }
}
