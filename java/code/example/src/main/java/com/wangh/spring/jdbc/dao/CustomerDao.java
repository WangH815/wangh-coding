package com.wangh.spring.jdbc.dao;

import com.wangh.spring.jdbc.model.Customer;

public interface CustomerDao {

    void insert(Customer customer);

    void delete(int customerID);

    Customer findByCustomerId(int customerID);
}
