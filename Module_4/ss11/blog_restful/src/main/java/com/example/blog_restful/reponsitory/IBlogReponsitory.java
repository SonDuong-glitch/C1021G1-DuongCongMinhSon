package com.example.blog_restful.reponsitory;

import com.example.blog_restful.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlogReponsitory extends JpaRepository<Blog,Long> {
    Page<Blog> findByNameOfBlogContaining(String name, Pageable pageable);
}
