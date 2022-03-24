package com.example.demo.service.employee_service;

import com.example.demo.model.person.employee.EmployeeEducationDegree;


import java.util.List;

public interface IEducationService {
    List<EmployeeEducationDegree> findAll();
}
