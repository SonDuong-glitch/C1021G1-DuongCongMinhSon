package com.example.demo.service.employee_service.impl;

import com.example.demo.model.person.employee.EmployeePosition;
import com.example.demo.reponsitory.employee_reponsitory.IPositionReponsitory;
import com.example.demo.service.employee_service.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService implements IPositionService {
    @Autowired
    IPositionReponsitory iPositionReponsitory;
    @Override
    public List<EmployeePosition> findAll() {
        return iPositionReponsitory.findAll();
    }
}
