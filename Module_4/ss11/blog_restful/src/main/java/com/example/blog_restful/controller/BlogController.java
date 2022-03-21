package com.example.blog_restful.controller;

import com.example.blog_restful.model.Blog;
import com.example.blog_restful.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/blog")
public class BlogController {
    @Autowired
    private IBlogService iBlogService;
    @GetMapping
    public ResponseEntity<Page<Blog>> findAllBlog(Pageable pageable){
        Page<Blog> blogList = iBlogService.findAll(pageable);
        if (blogList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogList, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public  ResponseEntity<Blog> findBlogById(@PathVariable Long id){
        Blog blog = iBlogService.findById(id);
        if(blog == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Blog> addNewBlog(@RequestBody Blog blog){
        return new ResponseEntity<>(iBlogService.save(blog),HttpStatus.CREATED);
    }

}
