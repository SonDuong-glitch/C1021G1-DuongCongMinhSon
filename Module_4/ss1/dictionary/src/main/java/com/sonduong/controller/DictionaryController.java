package com.sonduong.controller;

import com.sonduong.service.IWordImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class   DictionaryController {
    Map<String,String> list = new IWordImpl().listWord();
    @GetMapping("/")
    public String showPageDictionary(){
        return "result" ;
    }
    @PostMapping("/check")
    public String convert(@RequestParam String english, Model model){
        for (Map.Entry<String, String> entry : list.entrySet()) {
            if(entry.getKey().equals(english)){
                model.addAttribute("eng",entry.getValue());
            }
        }
        return "result";
    }
}
