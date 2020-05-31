package com.wangh.spring.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {
    public Customer() {
    }

    public Customer(Language language) {
        this();
        this.language = language;
    }

    private Person person;
    private Address address;
    private Language language;

    public Language getLanguage() {
        return language;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
