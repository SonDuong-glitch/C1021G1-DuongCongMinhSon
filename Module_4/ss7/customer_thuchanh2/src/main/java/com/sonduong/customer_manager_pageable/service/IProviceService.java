package com.sonduong.customer_manager_pageable.service;

import com.sonduong.customer_manager_pageable.model.Province;

import java.util.Optional;

public interface IProviceService {
    Iterable<Province> findAll();

    Province findById(int id);

    void save(Province province);

    void remove(int id);
}
