package com.example.customer_thuchanh2.service.Impl;

import com.example.customer_thuchanh2.model.Customer;
import com.example.customer_thuchanh2.model.Province;
import com.example.customer_thuchanh2.reponsitory.ICustomerReponsitory;
import com.example.customer_thuchanh2.service.ICustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomer
    {
    @Autowired
    private ICustomerReponsitory iCustomerReponsitory;
    @Override
    public Iterable<Customer> findAll() {
        return iCustomerReponsitory.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return iCustomerReponsitory.findById(id).orElse(null);
    }

    @Override
    public void save(Customer customer) {
        iCustomerReponsitory.save(customer);
    }

    @Override
    public void remove(Long id) {
        iCustomerReponsitory.deleteById(id);
    }

    @Override
    public Customer findAllByProvince(Province province) {
        return iCustomerReponsitory.findAllByProvince(province);
    }

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return iCustomerReponsitory.findAll(pageable);
    }

    @Override
    public Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable) {
        return iCustomerReponsitory.findAllByFirstNameContaining(firstname, pageable);
    }
}
