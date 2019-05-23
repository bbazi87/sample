package com.example.demo.controller;


import com.example.demo.model.Customer;
import com.example.demo.model.Order;
import com.example.demo.service.CustomerService;
import com.example.demo.service.OrderService;
import com.example.demo.service.ReportingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    //@Autowired --> über den Konstruktor
    private CustomerService customerService;
    private OrderService orderService;
    private ReportingService reportingService;

    @Autowired
    public CustomerController(CustomerService customerService, ReportingService reportingService) {
        this.customerService = customerService;
        this.orderService = orderService;
        this.reportingService = reportingService;
    }

    @GetMapping("/customer")
    public String greetings() {
        Customer customer = Customer.builder().firstName("Markus").lastName("Mustermann").build();
        customerService.saveCustomer(customer);
        return "Speichern erfolgreich";
    }

    @GetMapping("/customer-list")
    public List<Customer> getCustomerList() {
        return customerService.findAll();
    }

    @GetMapping("/order-list")
    public List<Order> getOrderList() {
        return orderService.findAll();
    }

    @GetMapping("/order")
    public String orderCreate() {
        Customer customer = Customer.builder().firstName("Markus").lastName("Meier").build();
        customerService.saveCustomer(customer);
        Order order = Order.builder().orderNum(110).customer(customer).build();
        orderService.saveOrder(order);
        return "Order gespeichert";
    }

}
