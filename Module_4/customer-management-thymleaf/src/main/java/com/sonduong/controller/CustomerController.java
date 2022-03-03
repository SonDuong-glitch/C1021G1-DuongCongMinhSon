package com.sonduong.controller;

import com.sonduong.model.Customer;
import com.sonduong.service.CustomerServiceImpl;
import com.sonduong.service.ICustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("")
public class CustomerController {
    private final ICustomerService customerService = new CustomerServiceImpl();
    @GetMapping("")
    public String listAll(Model model){
        List<Customer> customerList = customerService.findAll();
        model.addAttribute("customers",customerList);
        return "/home";
    }
    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("customer", new Customer());
        return "/create";
    }
    @PostMapping("/save")
    public String save(Customer customer) {
        customer.setId((int) (Math.random() * 10000));
        customerService.save(customer);
        return "redirect:/";
    }
    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        return "/edit";
    }
    @GetMapping("/{id}/delete")
    public String delete(Customer customer, RedirectAttributes redirect) {
        customerService.remove(customer.getId());
        redirect.addAttribute("success", "Removed customer successfully!");
        return "redirect:/";
    }
    @PostMapping("/update")
    public String update(Customer customer) {
        customerService.update(customer.getId(), customer);
        return "redirect:/";
    }
    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        return "/view";
    }
}
