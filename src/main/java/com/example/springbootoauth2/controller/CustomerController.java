package com.example.springbootoauth2.controller;

import com.example.springbootoauth2.model.CustomerData;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @GetMapping("/customer/{userId}")
    public CustomerData getCustomerProfile(@PathVariable("userId") String userId) {
        return getCustomer(userId);
    }

    private CustomerData getCustomer(final String userId) {
        CustomerData customer = new CustomerData();
        customer.setEmail("sandakag@gmail.com");
        customer.setFirstName("Sandaka");
        customer.setLastName("Wijesinghe");
        customer.setAge(27);
        customer.setId(userId);
        return customer;
    }
}
