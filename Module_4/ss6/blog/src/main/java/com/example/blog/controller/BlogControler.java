package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.service.IBlog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BlogControler {
@Autowired
    private IBlog iBlog;
@GetMapping("/create")
    public ModelAndView showCreateForm(){
    ModelAndView modelAndView = new ModelAndView("/blog/create");
    modelAndView.addObject("blog" , new Blog());
    return modelAndView;
}
@PostMapping("/create")
    public ModelAndView saveBlog(@ModelAttribute("blog") Blog blog){
    iBlog.save(blog);
    ModelAndView modelAndView = new ModelAndView("blog/create");
    modelAndView.addObject("Blog", blog);
    modelAndView.addObject("message","Create blog success");
    return modelAndView;
}
@GetMapping("")
    public ModelAndView listAll(){
    List<Blog> blogList = iBlog.listAll();
    ModelAndView modelAndView = new ModelAndView("/blog/list");
    modelAndView.addObject("blogs" , blogList);
    return modelAndView;
}
@GetMapping("edit/{id}")
    public ModelAndView showEditForm(@PathVariable int id){
    Blog blog = iBlog.findById(id);
    if(blog != null){
        ModelAndView modelAndView = new ModelAndView("/blog/edit");
        return modelAndView;
    }else{
        ModelAndView modelAndView = new ModelAndView("/blog/error404");
        return modelAndView;
    }
}
    }
