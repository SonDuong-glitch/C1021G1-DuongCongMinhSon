package com.example.customer_thuchanh2.reponsitory;

import com.example.customer_thuchanh2.model.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProvinceReponsitory extends JpaRepository<Province,Long> {
}
