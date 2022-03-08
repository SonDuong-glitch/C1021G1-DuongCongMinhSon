package com.example.blog.service;

import com.example.blog.model.Blog;
import com.example.blog.reponsitory.IBlogReponsitory;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IBlog{
    List<Blog> listAll();
    Blog findById(int id);
    void save(Blog blog);
    void remove(int id);
}
