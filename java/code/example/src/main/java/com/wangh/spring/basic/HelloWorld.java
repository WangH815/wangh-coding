package com.wangh.spring.basic;

public class HelloWorld {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public void printHello() {
        System.out.println("Spring 5 : Hello ! " + getName());
    }
}