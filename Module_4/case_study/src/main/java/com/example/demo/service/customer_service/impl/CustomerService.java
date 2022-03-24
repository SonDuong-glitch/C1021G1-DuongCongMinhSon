package com.example.demo.service.customer_service.impl;

import com.example.demo.model.person.customer.Customer;
import com.example.demo.reponsitory.customer_reponsitory.ICustomerReponsitory;
import com.example.demo.service.customer_service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerReponsitory iCustomerReponsitory;
    @Override
    public Page<Customer> findAllCustomer(Pageable pageable) {
        return iCustomerReponsitory.findAll(pageable);
    }

    @Override
    public Customer findById(Long id) {
        return iCustomerReponsitory.findById(id).orElse(null);
    }

    @Override
    public Customer save(Customer customer) {
        return iCustomerReponsitory.save(customer);
    }

    @Override
    public void remove(Customer customer) {
        iCustomerReponsitory.delete(customer);
    }

    @Override
    public void deteleById(Long id) {
        iCustomerReponsitory.deleteById(id);
    }

    @Override
    public Page<Customer> searchByName(String name, Pageable pageable) {
        return iCustomerReponsitory.findByCustomerNameContaining(name,pageable);
    }
}
