package com.example.customer_thuchanh2.reponsitory;

import com.example.customer_thuchanh2.model.Customer;
import com.example.customer_thuchanh2.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerReponsitory extends JpaRepository<Customer, Long> {
    Customer findAllByProvince(Province province);
    Page<Customer> findAllByFirstNameContaining(String firstName, Pageable pageable);
}
