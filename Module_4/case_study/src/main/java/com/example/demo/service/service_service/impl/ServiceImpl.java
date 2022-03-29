package com.example.demo.service.service_service.impl;

import com.example.demo.model.service.Service;
import com.example.demo.reponsitory.service_reponsitory.IServiceReponsitory;
import com.example.demo.service.service_service.IServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@org.springframework.stereotype.Service
public class ServiceImpl implements IServiceService {
    @Autowired
    private IServiceReponsitory iServiceReponsitory;
    @Override
    public Page<Service> findAllService(Pageable pageable) {
        return iServiceReponsitory.findAll(pageable);
    }

    @Override
    public Service findById(Long id) {
        return iServiceReponsitory.findById(id).orElse(null);
    }

    @Override
    public void removeService(Service service) {
        iServiceReponsitory.delete(service);
    }

    @Override
    public Service saveService(Service service) {
        return iServiceReponsitory.save(service);
    }

    @Override
    public Page<Service> findByNameContaining(String nameService, Pageable pageable) {
        return iServiceReponsitory.findByServiceNameContaining(nameService,pageable);
    }
}
