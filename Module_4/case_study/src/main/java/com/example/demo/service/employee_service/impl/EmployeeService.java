package com.example.demo.service.employee_service.impl;

import com.example.demo.model.person.employee.Employee;
import com.example.demo.reponsitory.employee_reponsitory.IEmployeeReponsitory;
import com.example.demo.service.employee_service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private IEmployeeReponsitory iEmployeeReponsitory;

    @Override
    public Page<Employee> findAll(Pageable pageable) {
        return iEmployeeReponsitory.findAll(pageable);
    }

    @Override
    public Employee findById(Long id) {
        return iEmployeeReponsitory.findById(id).orElse(null);
    }

    @Override
    public Employee save(Employee employee) {
        return iEmployeeReponsitory.save(employee);
    }

    @Override
    public void remove(Employee employee) {
        iEmployeeReponsitory.delete(employee);
    }

    @Override
    public Page<Employee> findByName(String nameEmployee, Pageable pageable) {
        return iEmployeeReponsitory.findByEmployeeNameContaining(nameEmployee,pageable);
    }
}
