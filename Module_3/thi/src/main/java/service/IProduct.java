package service;

import model.Product;

import java.util.List;

public interface IProduct {
    List<Product> findAll();
    void create(Product phone);
    void delete(int id);
    void search(int id);
    void edit(int id);
}
