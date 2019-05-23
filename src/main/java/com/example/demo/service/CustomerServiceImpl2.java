package com.example.demo.service;

import com.example.demo.model.Customer;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Profile(value = "IMPL2")
@Service
public class CustomerServiceImpl2 implements CustomerService {
    @Override
    public void test() {
        System.out.println("hello");
    }

    @Override
    public void saveCustomer(Customer customer) {

    }

    @Override
    public List<Customer> findAll() {
        return null;
    }
}
