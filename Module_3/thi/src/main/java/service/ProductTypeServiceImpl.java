package service;

import model.TypeProduct;
import repository.ProductTypeReponsitory;
import repository.impl.TypeProductImpl;

import java.util.List;

public class ProductTypeServiceImpl implements ITypeProduct{
    ProductTypeReponsitory productTypeReponsitory = new TypeProductImpl();
    @Override
    public List<TypeProduct> findAll() {
        return productTypeReponsitory.findAll();
    }
}
