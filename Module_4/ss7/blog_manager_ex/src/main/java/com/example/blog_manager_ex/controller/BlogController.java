package com.example.blog_manager_ex.controller;

import com.example.blog_manager_ex.model.Blog;
import com.example.blog_manager_ex.model.Category;
import com.example.blog_manager_ex.service.IBlogService;
import com.example.blog_manager_ex.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class BlogController {
    @Autowired
    private IBlogService iBlogService;
    @Autowired
    private ICategoryService iCategoryService;
    private boolean isSortByTime = false;
    @RequestMapping
    public String display(@RequestParam(required = false,defaultValue = "hello") String sort, Model model){
        Pageable sortByDesc = PageRequest.of(0,3, Sort.by("time").descending());
        Pageable sortByAsc =PageRequest.of(0,3,Sort.by("time").ascending());
        if(!sort.contains("abc")){
            isSortByTime = !isSortByTime;
        } if(isSortByTime){
            model.addAttribute("sort","true");
        }else{
            model.addAttribute("sort","false");
        }
        if(isSortByTime){
            Page<Blog> blogList = iBlogService.findAll(sortByDesc);
            model.addAttribute("listBlog",blogList);
        }else{
            Page<Blog> blogList = iBlogService.findAll(sortByAsc);
            model.addAttribute("listBlog",blogList);
        }
        return "blog/home";
    }
    @GetMapping("/show-create-form")
    public String showCreateForm( Model model,@PageableDefault(size = 10)Pageable pageable){
        Page<Category> categories = iCategoryService.findAll(pageable);
        model.addAttribute("categories",categories);
        model.addAttribute("blog",new Blog());
        return "blog/create";
    }
    @PostMapping("/create")
    public String create(Blog blog){
        blog.setTime(new Date().getTime());
        iBlogService.add(blog);
        return ("redirect:/");
    }
}
