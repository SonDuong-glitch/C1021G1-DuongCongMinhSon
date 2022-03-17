package com.example.borrow_books.reponsitory;

import com.example.borrow_books.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer,Long> {
    Customer findByNameCustomer(String customerName);
}
