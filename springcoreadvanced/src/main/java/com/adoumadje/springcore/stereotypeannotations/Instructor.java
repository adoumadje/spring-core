package com.adoumadje.springcore.stereotypeannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("inst")
@Scope("prototype")
public class Instructor {
    @Value("123")
    private Long id = 12L;
    @Value("Mac Allister")
    private String name = "Camavinga";
    @Value("#{students}")
    private List<String> students;
    @Autowired
    private Profile profile;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", students=" + students +
                ", profile=" + profile +
                '}';
    }
}
