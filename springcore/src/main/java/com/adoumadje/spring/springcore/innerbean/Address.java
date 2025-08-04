package com.adoumadje.spring.springcore.innerbean;

public class Address {
    private Long houseNumber;
    private String street;
    private String city;

    public Long getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(Long houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNumber=" + houseNumber +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
