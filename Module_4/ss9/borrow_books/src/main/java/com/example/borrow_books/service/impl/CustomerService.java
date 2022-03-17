package com.example.borrow_books.service.impl;

import com.example.borrow_books.model.Customer;
import com.example.borrow_books.reponsitory.ICustomerRepository;
import com.example.borrow_books.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository customerRepository;
    @Override
    public Customer findCustomerByName(String customerName) {
        return customerRepository.findByNameCustomer(customerName);
    }
}
