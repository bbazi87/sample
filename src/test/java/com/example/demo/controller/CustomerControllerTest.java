package com.example.demo.controller;

import com.example.demo.service.CustomerService;
import com.example.demo.service.ReportingService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CustomerControllerTest {

    private CustomerController sut;

    @Mock
    private CustomerService customerService; //= new CustomerServiceImpl();

    @Mock
    private ReportingService reportingService;

    @Before
    public void setUp() {
        sut = new CustomerController(customerService, reportingService);
    }

    @Test
    public void test() {
        System.out.println("test");
    }

}