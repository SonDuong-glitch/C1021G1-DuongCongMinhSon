package com.sonduong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwidController {
    @RequestMapping("/")
    public String home(){
        return "display";
    }
    @GetMapping("/save")
    public String save(@RequestParam("condiments") String[] condiment, Model model) {
        model.addAttribute("condiments", condiment);
            return "infor";
    }
}
