package com.example.demo.reponsitory.service_reponsitory;

import com.example.demo.model.service.RentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRentTypeReponsitory extends JpaRepository<RentType, Long> {
}
