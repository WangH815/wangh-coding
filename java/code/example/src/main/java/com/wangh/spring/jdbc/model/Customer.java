package com.wangh.spring.jdbc.model;

public class Customer {
    public int getCustomerID() {
        return customerID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int customerID;
    private String name;
    private int age;

    public Customer(int customerID, String name, int age) {
        this.customerID = customerID;
        this.name = name;
        this.age = age;
    }
}
