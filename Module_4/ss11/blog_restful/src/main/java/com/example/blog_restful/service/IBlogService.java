package com.example.blog_restful.service;

import com.example.blog_restful.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBlogService {
    Page<Blog> findAll(Pageable pageable);
    Blog findById(Long id);
    void remove(Long id);
    Blog save(Blog blog);
    void edit(Blog blog);
    Page<Blog> search(String nameOfBlog,Pageable pageable);
}
