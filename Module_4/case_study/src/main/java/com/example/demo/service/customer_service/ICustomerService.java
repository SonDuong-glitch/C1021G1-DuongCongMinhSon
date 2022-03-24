package com.example.demo.service.customer_service;

import com.example.demo.model.person.customer.Customer;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerService {
    Page<Customer> findAllCustomer(Pageable pageable);
    Customer findById(Long id);
    Customer save(Customer customer);
    void remove(Customer customer);
    void deteleById(Long id);
    Page<Customer> searchByName(String name, Pageable pageable);
}
