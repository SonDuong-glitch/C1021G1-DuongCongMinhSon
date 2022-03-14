package com.sonduong.customer_manager_pageable.repository;

import com.sonduong.customer_manager_pageable.model.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProvinceReponsitory extends JpaRepository<Province,Integer> {
}
