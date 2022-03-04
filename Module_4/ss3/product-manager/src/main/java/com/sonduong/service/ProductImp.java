package com.sonduong.service;

import com.sonduong.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductImp implements IProduct{
    private static Map<Integer,Product> products;
    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"Quạt",1200000,"Bảo hành 12 tháng", "Panasonic"));
        products.put(2,new Product(2,"Máy tính",21000000,"Bảo hành 24 tháng", "Acer"));
        products.put(3,new Product(3,"TiVi",4324000,"Bảo hành 12 tháng", "LG"));
        products.put(4,new Product(4,"Máy tính",23599000,"Bảo hành 24 tháng", "MSI"));
        products.put(5,new Product(5,"Điều Hòa",2000000,"Bảo hành 12 tháng", "Senko"));
        products.put(6,new Product(6,"Máy hút bụi",1200000,"Bảo hành 12 tháng", "Panasonic"));
        products.put(7,new Product(7,"Nồi cơm",1300000,"Bảo hành 12 tháng", "Panasonic"));
        products.put(8,new Product(8,"Lò vi sóng",1400000,"Bảo hành 12 tháng", "Panasonic"));
    }
    @Override
    public List<Product> listAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void delete(int id) {
        products.remove(id);
    }
}
