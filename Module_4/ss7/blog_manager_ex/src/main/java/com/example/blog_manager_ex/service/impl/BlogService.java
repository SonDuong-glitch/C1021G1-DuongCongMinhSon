package com.example.blog_manager_ex.service.impl;

import com.example.blog_manager_ex.model.Blog;
import com.example.blog_manager_ex.reponsitory.IBlogReponsitory;
import com.example.blog_manager_ex.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogReponsitory iBlogReponsitory;
    @Override
    public void add(Blog blog) {
        iBlogReponsitory.save(blog);
    }

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return iBlogReponsitory.findAll(pageable);
    }

    @Override
    public Blog findById(Long id) {
        return iBlogReponsitory.findById(id).orElse(null);
    }

    @Override
    public void remove(Long id) {
        iBlogReponsitory.deleteById(id);
    }

    @Override
    public void edit(Blog blog) {
        iBlogReponsitory.save(blog);
    }

    @Override
    public Page<Blog> search(String name, Pageable pageable) {
        return iBlogReponsitory.findByTitleContaining(name,pageable);
    }
}
