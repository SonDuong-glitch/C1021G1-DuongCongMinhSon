package com.example.demo.service.customer_service;

import com.example.demo.model.person.customer.CustomerType;

import java.util.List;

public interface ICustomerTypeService {
    List<CustomerType> findAll();
}
