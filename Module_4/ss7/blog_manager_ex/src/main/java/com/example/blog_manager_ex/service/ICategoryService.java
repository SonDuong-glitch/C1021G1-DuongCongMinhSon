package com.example.blog_manager_ex.service;

import com.example.blog_manager_ex.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICategoryService {
    void add(Category category);
    Page<Category> findAll(Pageable pageable);

    Category findById(Long id);

    void remove(Long id);

    void edit(Category category);
}
