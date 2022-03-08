package com.example.customer_manager1.reponsitory;

import com.example.customer_manager1.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IGeneralService extends JpaRepository<Customer, Integer> {

}
