package com.example.customer_thuchanh2.service;

import com.example.customer_thuchanh2.model.Province;

import java.util.Optional;

public interface IProvince {
    Iterable<Province> findAll();

    Optional<Province> findById(Long id);

    void save(Province province);

    void remove(Long id);
}
