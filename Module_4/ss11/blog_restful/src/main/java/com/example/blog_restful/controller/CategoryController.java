package com.example.blog_restful.controller;

import com.example.blog_restful.model.Blog;
import com.example.blog_restful.model.Category;
import com.example.blog_restful.service.IBlogService;
import com.example.blog_restful.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api/category")
public class CategoryController {
    @Autowired
    private ICategoryService categoryService;
    @GetMapping
    public ResponseEntity<Page<Blog>> findAllBlog(Pageable pageable){
        List<Category> categoryList = (List<Category>) categoryService.findAll(pageable);
        if (categoryList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<Page<Blog>>((MultiValueMap<String, String>) categoryList, HttpStatus.OK);
    }
}
