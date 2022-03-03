package com.sonduong.controller;

import com.sonduong.model.Login;
import com.sonduong.model.User;

import com.sonduong.service.UserImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    private UserImpl userImpl = new UserImpl();
    @GetMapping("")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("/login", "login", new Login());
        return modelAndView;
    }
    @PostMapping("login")
    public ModelAndView login(@ModelAttribute("login")Login login){
        User users = userImpl.checkLogin(login);
        if(users == null){
            ModelAndView modelAndView = new ModelAndView("error");
            return modelAndView;
        }
        ModelAndView modelAndView = new ModelAndView("user");
        modelAndView.addObject("user", users);
        return modelAndView;
    }
}
