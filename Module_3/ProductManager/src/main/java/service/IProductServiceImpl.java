package service;

import model.Product;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IProductServiceImpl implements IProductService{
    private static Map<Integer,Product> products;
    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"Quat","Con Bao Hanh","Senko"));
        products.put(2,new Product(2,"Dieu Hoa","Het Bao Hanh","DaiKin"));
        products.put(3,new Product(3,"Lo Vi Song","Het Bao Hanh","Sharp"));
        products.put(4,new Product(4,"Tivi","Con Bao Hanh","LG"));
        products.put(5,new Product(5,"Tu Lanh","Het Bao Hanh","Senko"));
    }
    @Override
    public List<Product> listProduct() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(),product);
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
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public Product searchByName(String name) {
       return products.get(name);
    }
}
