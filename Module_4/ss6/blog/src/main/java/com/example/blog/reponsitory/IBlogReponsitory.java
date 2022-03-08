package com.example.blog.reponsitory;

import com.example.blog.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlogReponsitory extends JpaRepository<Blog,Integer> {
}
