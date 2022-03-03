package com.sonduong.controller;

import com.sonduong.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class EmployeeController {
    @GetMapping("/showForm")
    public String showForm(Model model){
        model.addAttribute("employee", new Employee());
        return "show_form_create";
    }
    @PostMapping("/update")
    public String submit(@ModelAttribute("employee") Employee employee, ModelMap model){
        model.addAttribute(employee);
        return "show_infor";
    }
}
