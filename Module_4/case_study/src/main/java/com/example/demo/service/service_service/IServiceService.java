package com.example.demo.service.service_service;

import com.example.demo.model.service.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IServiceService {
    Page<Service> findAllService(Pageable pageable);
    Service findById(Long id);
    void removeService(Service service);
    Service saveService(Service service);
    Page<Service> findByNameContaining(String nameService, Pageable pageable);
}
