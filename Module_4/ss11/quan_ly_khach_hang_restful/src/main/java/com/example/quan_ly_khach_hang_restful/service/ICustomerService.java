package com.example.quan_ly_khach_hang_restful.service;

import com.example.quan_ly_khach_hang_restful.model.Customer;

import java.util.Optional;

public interface ICustomerService {
    Iterable<Customer> findAll();
    Optional<Customer> findById(Long id);
    Customer save(Customer customer);
    void remove (Long id);
}
