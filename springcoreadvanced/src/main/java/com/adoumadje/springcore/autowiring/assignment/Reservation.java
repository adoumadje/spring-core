package com.adoumadje.springcore.autowiring.assignment;

public class Reservation {
    private Long id;
    private String time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", time='" + time + '\'' +
                '}';
    }
}
