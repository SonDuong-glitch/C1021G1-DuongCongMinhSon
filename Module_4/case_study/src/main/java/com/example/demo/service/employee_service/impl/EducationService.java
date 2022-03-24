package com.example.demo.service.employee_service.impl;

import com.example.demo.model.person.employee.EmployeeEducationDegree;
import com.example.demo.reponsitory.employee_reponsitory.IEducationDegreeReponsitory;
import com.example.demo.service.employee_service.IEducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationService implements IEducationService {
    @Autowired
    private IEducationDegreeReponsitory iEducationDegreeReponsitory;
    @Override
    public List<EmployeeEducationDegree> findAll() {
        return iEducationDegreeReponsitory.findAll();
    }
}
