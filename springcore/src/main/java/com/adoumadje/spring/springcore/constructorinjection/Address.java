package com.adoumadje.spring.springcore.constructorinjection;

public class Address {
    private String street;
    private Integer buildingNumber;
    private String city;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(Integer buildingNumber) {
        this.buildingNumber = buildingNumber;
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
                "street='" + street + '\'' +
                ", buildingNumber=" + buildingNumber +
                ", city='" + city + '\'' +
                '}';
    }
}
