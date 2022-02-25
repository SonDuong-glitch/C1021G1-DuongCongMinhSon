package repository;

import model.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> findAll();
    void create(Product product);
    void delete(int id);
    void edit(int id);
    void search(int id);
}
