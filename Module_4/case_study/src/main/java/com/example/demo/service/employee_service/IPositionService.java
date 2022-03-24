package com.example.demo.service.employee_service;

import com.example.demo.model.person.employee.EmployeePosition;


import java.util.List;

public interface IPositionService {
    List<EmployeePosition> findAll();
}
