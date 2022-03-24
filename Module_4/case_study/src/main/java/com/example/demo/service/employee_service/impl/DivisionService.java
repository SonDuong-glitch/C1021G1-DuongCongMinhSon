package com.example.demo.service.employee_service.impl;

import com.example.demo.model.person.employee.EmployeeDivision;
import com.example.demo.reponsitory.employee_reponsitory.IDivisionReponsitory;
import com.example.demo.service.employee_service.IDivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionService implements IDivisionService {
    @Autowired
    private IDivisionReponsitory iDivisionReponsitory;
    @Override
    public List<EmployeeDivision> findAll( ) {

        return iDivisionReponsitory.findAll();
    }
}
