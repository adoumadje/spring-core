package com.adoumadje.springcore.stereotypeannotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile {
    @Value("Java Web Services")
    private String course;
    @Value("Oracle University")
    private String school;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "course='" + course + '\'' +
                ", school='" + school + '\'' +
                '}';
    }
}
