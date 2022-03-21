package com.example.blog_restful.service.impl;

import com.example.blog_restful.model.Blog;
import com.example.blog_restful.reponsitory.IBlogReponsitory;
import com.example.blog_restful.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BlogImpl implements IBlogService {
    @Autowired
    private IBlogReponsitory iBlogReponsitory;
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
    public Blog save (Blog blog) {
        return iBlogReponsitory.save(blog);
    }

    @Override
    public void edit(Blog blog) {
        iBlogReponsitory.save(blog);
    }

    @Override
    public Page<Blog> search(String nameOfBlog, Pageable pageable) {
        return iBlogReponsitory.findByNameOfBlogContaining(nameOfBlog,pageable);
    }
}
