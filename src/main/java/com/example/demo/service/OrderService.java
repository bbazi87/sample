package com.example.demo.service;

import com.example.demo.model.Order;

import java.util.List;

public interface OrderService {
    void test();
    void saveOrder(Order order);
    List<Order> findAll();
}
