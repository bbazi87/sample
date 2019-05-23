package com.example.demo.service;

import com.example.demo.model.Customer;

import java.util.List;

public interface CustomerService {
    void test();
    void saveCustomer(Customer customer);
    List<Customer> findAll();
}
