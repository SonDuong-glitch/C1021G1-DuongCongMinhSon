package com.example.demo.reponsitory.service_reponsitory;

import com.example.demo.model.service.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IServiceReponsitory extends JpaRepository<Service,Long> {
    Page<Service> findByServiceNameContaining(String serviceName, Pageable pageable);
}
