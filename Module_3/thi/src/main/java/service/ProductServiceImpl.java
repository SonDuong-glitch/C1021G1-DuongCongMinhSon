package service;

import model.Product;
import repository.ProductRepository;

import java.util.List;

public class ProductServiceImpl implements IProduct {
    ProductRepository productRepository = new repository.impl.ProductImpl();
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void create(Product product) {
        productRepository.create(product);
    }

    @Override
    public void delete(int id) {
        productRepository.delete(id);
    }

    @Override
    public void search(int id) {
        productRepository.search(id);
    }

    @Override
    public void edit(int id) {
        productRepository.edit(id);
    }
}
