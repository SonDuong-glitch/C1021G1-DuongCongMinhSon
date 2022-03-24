package com.example.demo.reponsitory.customer_reponsitory;

import com.example.demo.model.person.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerReponsitory extends JpaRepository<Customer,Long> {
    Page<Customer> findByCustomerNameContaining (String customerName, Pageable pageable);
}
