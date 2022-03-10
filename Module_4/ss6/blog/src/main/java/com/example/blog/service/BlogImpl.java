package com.example.blog.service;

import com.example.blog.model.Blog;
import com.example.blog.reponsitory.IBlogReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class BlogImpl implements IBlog{
    @Autowired
    private IBlogReponsitory iBlogReponsitory;
    @Override
    public List<Blog> listAll() {
        return iBlogReponsitory.findAll();
    }

    @Override
    public Blog findById(int id) {
        return iBlogReponsitory.findById(id).orElse(null);
    }

    @Override
    public void save(Blog blog) {
        iBlogReponsitory.save(blog);
    }

    @Override
    public void remove(int id) {
        iBlogReponsitory.deleteById(id);
    }
}
