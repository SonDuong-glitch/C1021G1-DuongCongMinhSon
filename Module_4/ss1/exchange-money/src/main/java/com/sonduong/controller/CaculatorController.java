package com.sonduong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaculatorController {
    @GetMapping("/")
    public String CaculatorPage(){
        return "result";
    }
    @GetMapping("/calculator")
    public String calculator(@RequestParam int value, @RequestParam int price, Model model){
        int result = value*price;
        model.addAttribute("result",result);
        return "/result";
    }
}
