package com.example.customer_manager1.service;

import com.example.customer_manager1.model.Customer;
import com.example.customer_manager1.reponsitory.IGeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerImpl implements ICustomerService{
    @Autowired
    private IGeneralService iGeneralService;

    @Override
    public List<Customer> findAll() {
        return iGeneralService.findAll();
    }

    @Override
    public Customer findById(int id) {
        return iGeneralService.findById(id).orElse(null);
    }

    @Override
    public void save(Customer customer) {
        iGeneralService.save(customer);
    }

    @Override
    public void remove(long id) {
        iGeneralService.deleteById((int) id);
    }
}
