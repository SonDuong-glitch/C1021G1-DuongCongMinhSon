package com.example.demo.service.service_service.impl;

import com.example.demo.model.service.ServiceType;
import com.example.demo.reponsitory.service_reponsitory.IServiceTypeReponsitory;
import com.example.demo.service.service_service.IServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceTypeImpl implements IServiceTypeService {
    @Autowired
    private IServiceTypeReponsitory iServiceTypeReponsitory;
    @Override
    public List<ServiceType> findAll() {
        return iServiceTypeReponsitory.findAll();
    }
}
