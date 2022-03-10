package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.service.BlogImpl;
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
    private BlogImpl iBlog;
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
        ModelAndView modelAndView = new ModelAndView("blog/edit");
        modelAndView.addObject("blog", blog);
        return modelAndView;
    }else{
        ModelAndView modelAndView = new ModelAndView("blog/error404");
        return modelAndView;
    }
}
@PostMapping("/edit")
    public ModelAndView updateBlog(@ModelAttribute("blog") Blog blog){
    iBlog.save(blog);
    ModelAndView modelAndView = new ModelAndView("/blog/edit");
    modelAndView.addObject("blog",blog);
    modelAndView.addObject("message", "Update success");
    return modelAndView;
}
@GetMapping("remove/{id}")
    public  ModelAndView deleteShowForm(@PathVariable int id ){
        Blog blog = iBlog.findById(id);
        if(blog != null){
            ModelAndView modelAndView = new ModelAndView("blog/remove");
            modelAndView.addObject("blog" , blog);
            return modelAndView;
        }else {
            ModelAndView modelAndView = new ModelAndView("blog/error404");
            return modelAndView;
        }
    }
    @PostMapping("remove")
    public String deleteBlog(@ModelAttribute("blog") Blog blog){
        iBlog.remove(blog.getId());
        return "redirect:/";
    }
    @GetMapping("viewOne/{id}")
    public ModelAndView findOne(@PathVariable int id){
        Blog blog = iBlog.findById(id);
        if(blog != null){
            ModelAndView modelAndView = new ModelAndView("blog/viewOne");
            modelAndView.addObject("blog",blog);
            return modelAndView;
        }else{
            ModelAndView modelAndView = new ModelAndView("blog/error404");
            return modelAndView;
        }
    }
}
