package com.example.borrow_books.service;

import com.example.borrow_books.model.Customer;

public interface ICustomerService {
    Customer findCustomerByName(String customerName);
}
