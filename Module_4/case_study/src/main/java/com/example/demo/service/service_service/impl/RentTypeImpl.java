package com.example.demo.service.service_service.impl;

import com.example.demo.model.service.RentType;
import com.example.demo.reponsitory.service_reponsitory.IRentTypeReponsitory;
import com.example.demo.service.service_service.IRentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RentTypeImpl implements IRentTypeService {
    @Autowired
    private IRentTypeReponsitory iRentTypeReponsitory;
    @Override
    public List<RentType> findAll() {
        return iRentTypeReponsitory.findAll();
    }
}
