package spring.java.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {
    @Autowired
    private DAO dao;

    public void create() {
        System.out.println("inside Service create() calls:");
        dao.save();
    }

    public void init() {
        System.out.println("init method");
    }

    public void destroy() {
        System.out.println("destroy method");
    }
}
