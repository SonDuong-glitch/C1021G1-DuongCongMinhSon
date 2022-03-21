package com.example.quan_ly_khach_hang_restful.reponsitory;

import com.example.quan_ly_khach_hang_restful.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerReponsitory extends PagingAndSortingRepository<Customer,Long> {

}
