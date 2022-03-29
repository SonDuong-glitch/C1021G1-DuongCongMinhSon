package com.example.demo.reponsitory.employee_reponsitory;

import com.example.demo.model.person.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeReponsitory extends JpaRepository<Employee,Long> {
    Page<Employee> findByEmployeeNameContaining(String nameEmployee, Pageable pageable);
}
