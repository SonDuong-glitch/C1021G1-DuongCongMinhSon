package com.sonduong.customer_manager_pageable.service.Impl;

import com.sonduong.customer_manager_pageable.model.Province;
import com.sonduong.customer_manager_pageable.repository.IProvinceReponsitory;
import com.sonduong.customer_manager_pageable.service.IProviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProvinceImpl implements IProviceService {
    @Autowired
    private IProvinceReponsitory iProvinceReponsitory;
    @Override
    public Iterable<Province> findAll() {
        return iProvinceReponsitory.findAll();
    }

    @Override
    public Province findById(int id) {
        return iProvinceReponsitory.findById(id).orElse(null);
    }

    @Override
    public void save(Province province) {
        iProvinceReponsitory.save(province);
    }

    @Override
    public void remove(int id) {
        iProvinceReponsitory.deleteById(id);
    }
}
