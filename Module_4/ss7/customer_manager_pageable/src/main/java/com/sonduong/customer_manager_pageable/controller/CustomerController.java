package com.sonduong.customer_manager_pageable.controller;

import com.sonduong.customer_manager_pageable.model.Customer;
import com.sonduong.customer_manager_pageable.model.Province;
import com.sonduong.customer_manager_pageable.service.Impl.CustomerImpl;
import com.sonduong.customer_manager_pageable.service.Impl.ProvinceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class CustomerController {
    @Autowired
    private CustomerImpl customerService;
    @Autowired
    private ProvinceImpl provinceService;
    @ModelAttribute("provinces")
    public Iterable<Province> provinces(){
        return provinceService.findAll();
    }
    @GetMapping("/create")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/customer/create");
        modelAndView.addObject("customer", new Customer());
        return modelAndView;
    }
    @PostMapping("/create")
    public ModelAndView createCustomer(@ModelAttribute ("customer") Customer customer) {
        customerService.save(customer);
        ModelAndView modelAndView = new ModelAndView("customer/create");
        modelAndView.addObject("customer", customer);
        modelAndView.addObject("message", "Create customer success");

        return modelAndView;
    }
    @GetMapping("/")
    public ModelAndView showListCustomer(@RequestParam("search")Optional<String> search ,@PageableDefault(value = 5) Pageable pageable){
        Page<Customer> customers ;
        if(search.isPresent()){
            customers = customerService.findAllByFirstNameContaining(search.get(), pageable);
        }else {
            customers = customerService.findAll( pageable);
        }
        ModelAndView modelAndView = new ModelAndView("/customer/list");
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }
    @GetMapping("/edit/{id}")
    public ModelAndView showEditForm( @PathVariable int id ){
        Optional<Customer> customer = customerService.findById(id);
        if (customer.isPresent()) {
            ModelAndView modelAndView = new ModelAndView("/customer/edit");
            modelAndView.addObject("customer", customer.get());
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }
    @PostMapping("/edit")
    public ModelAndView updateCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.save(customer);
        ModelAndView modelAndView = new ModelAndView("/customer/edit");
        modelAndView.addObject("customer", customer);
        modelAndView.addObject("message", "Customer updated successfully");
        return modelAndView;
    }
    @GetMapping("/delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable int id) {
        Optional<Customer> customer = customerService.findById(id);
        if (customer.isPresent()) {
            ModelAndView modelAndView = new ModelAndView("/customer/delete");
            modelAndView.addObject("customer", customer.get());
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }
    @PostMapping("/delete")
    public String deleteCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.remove(customer.getId());
        return "redirect:/";
    }
}
