package com.example.quan_ly_khach_hang_restful.service;

import com.example.quan_ly_khach_hang_restful.model.Customer;
import com.example.quan_ly_khach_hang_restful.reponsitory.ICustomerReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CustomerService implements ICustomerService{
    @Autowired
    private ICustomerReponsitory iCustomerReponsitory;
    @Override
    public Iterable<Customer> findAll() {
        return iCustomerReponsitory.findAll();
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return iCustomerReponsitory.findById(id);
    }

    @Override
    public Customer save(Customer customer) {
        return iCustomerReponsitory.save(customer);
    }

    @Override
    public void remove(Long id) {
        iCustomerReponsitory.deleteById(id);
    }
}
