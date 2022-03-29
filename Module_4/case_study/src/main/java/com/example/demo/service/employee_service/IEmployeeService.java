package com.example.demo.service.employee_service;

import com.example.demo.model.person.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IEmployeeService {
    Page<Employee> findAll(Pageable pageable);
    Employee findById(Long id);
    Employee save(Employee employee);
    void remove(Employee employee);
    Page<Employee> findByName(String nameEmployee, Pageable pageable);
}
