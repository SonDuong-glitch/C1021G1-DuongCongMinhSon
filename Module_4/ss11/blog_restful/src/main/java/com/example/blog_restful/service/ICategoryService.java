package com.example.blog_restful.service;

import com.example.blog_restful.model.Blog;
import com.example.blog_restful.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICategoryService {
    Page<Category> findAll(Pageable pageable);
    Category findById(Long id);
    void remove(Long id);
    void edit(Category category);
    Page<Category> search(String nameOfCategory, Pageable pageable);
}
