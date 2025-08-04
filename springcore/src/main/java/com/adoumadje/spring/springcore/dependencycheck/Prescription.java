package com.adoumadje.spring.springcore.dependencycheck;

import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class Prescription {
    private Long id;
    private String name;
    private List<String> medecines;

    public Long getId() {
        return id;
    }

    @Required
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMedecines() {
        return medecines;
    }

    public void setMedecines(List<String> medecines) {
        this.medecines = medecines;
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", medecines=" + medecines +
                '}';
    }
}
