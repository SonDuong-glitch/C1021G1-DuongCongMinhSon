package com.example.blog_manager_ex.service.impl;

import com.example.blog_manager_ex.model.Category;
import com.example.blog_manager_ex.reponsitory.ICategoryReponsitory;
import com.example.blog_manager_ex.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryReponsitory iCategoryReponsitory;
    @Override
    public void add(Category category) {
        iCategoryReponsitory.save(category);
    }

    @Override
    public Page<Category> findAll(Pageable pageable) {
        return iCategoryReponsitory.findAll(pageable);
    }

    @Override
    public Category findById(Long id) {
        return iCategoryReponsitory.findById(id).orElse(null);
    }

    @Override
    public void remove(Long id) {
        iCategoryReponsitory.deleteById(id);
    }

    @Override
    public void edit(Category category) {
        iCategoryReponsitory.save(category);
    }
}
