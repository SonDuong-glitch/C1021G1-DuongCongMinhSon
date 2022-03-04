package com.sonduong.service;

import com.sonduong.model.Product;

import java.util.List;

public interface IProduct {
    List<Product> listAll();
    void save(Product product);
    Product findById(int id);
    void update(int id, Product product);
    void delete(int id);
}
