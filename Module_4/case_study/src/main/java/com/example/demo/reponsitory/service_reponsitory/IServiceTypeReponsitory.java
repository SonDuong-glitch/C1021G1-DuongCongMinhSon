package com.example.demo.reponsitory.service_reponsitory;

import com.example.demo.model.service.ServiceType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IServiceTypeReponsitory extends JpaRepository<ServiceType,Long> {
}
