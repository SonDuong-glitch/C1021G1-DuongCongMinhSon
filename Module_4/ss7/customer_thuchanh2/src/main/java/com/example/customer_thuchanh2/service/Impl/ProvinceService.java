package com.example.customer_thuchanh2.service.Impl;

import com.example.customer_thuchanh2.model.Province;
import com.example.customer_thuchanh2.reponsitory.IProvinceReponsitory;
import com.example.customer_thuchanh2.service.IProvince;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProvinceService implements IProvince {
    @Autowired
    private IProvinceReponsitory iProvinceReponsitory;
    @Override
    public Iterable<Province> findAll() {
        return iProvinceReponsitory.findAll();
    }

    @Override
    public Optional<Province> findById(Long id) {
       return iProvinceReponsitory.findById(id);
    }
    @Override
    public void save(Province province) {
        iProvinceReponsitory.save(province);
    }

    @Override
    public void remove(Long id) {
        iProvinceReponsitory.deleteById(id);
    }
}
