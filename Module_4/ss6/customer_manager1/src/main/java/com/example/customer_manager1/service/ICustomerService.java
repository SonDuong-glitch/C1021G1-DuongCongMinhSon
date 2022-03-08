package com.example.customer_manager1.service;

import com.example.customer_manager1.model.Customer;


import java.util.List;

public interface ICustomerService   {
    List<Customer> findAll();

    Customer findById(int id);

    void save (Customer customer);

    void remove (long id);
}
