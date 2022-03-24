package com.example.demo.reponsitory.customer_reponsitory;

import com.example.demo.model.person.customer.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerTypeReponsitory extends JpaRepository<CustomerType,Long> {
}
