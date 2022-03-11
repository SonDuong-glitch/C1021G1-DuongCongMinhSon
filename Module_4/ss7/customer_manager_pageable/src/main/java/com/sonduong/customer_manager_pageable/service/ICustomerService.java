package com.sonduong.customer_manager_pageable.service;


import com.sonduong.customer_manager_pageable.model.Customer;
import com.sonduong.customer_manager_pageable.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.Optional;

public interface ICustomerService  {
    Iterable<Customer> findAll();

    Optional<Customer> findById(int id);

    void save(Customer customer);

    void remove(int id);
    Iterable<Customer> findAllByProvince(Province province);
    Page<Customer> findAll(Pageable pageable);
    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);
}
