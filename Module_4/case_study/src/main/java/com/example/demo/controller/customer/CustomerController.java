package com.example.demo.controller.customer;

import com.example.demo.dto.CustomerDto;
import com.example.demo.model.person.customer.Customer;
import com.example.demo.model.person.customer.CustomerType;
import com.example.demo.service.customer_service.ICustomerService;
import com.example.demo.service.customer_service.ICustomerTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;


@Controller
public class CustomerController {
    @Autowired
    private ICustomerService iCustomerService;
    @Autowired
    private ICustomerTypeService iCustomerTypeService;

    @RequestMapping
    public String homePage(){
        return "/home";
    }
    @GetMapping("/customer")
    public String findAll(@PageableDefault(size = 5) Pageable pageable, Model model){
        Page<Customer> customers = iCustomerService.findAllCustomer(pageable);
        model.addAttribute("customers",customers);
        return "customer/listCustomer";
    }
    @GetMapping("/showCreateForm")
    public String showCreateFormCustomer(Model model){
        List<CustomerType> customerTypes = iCustomerTypeService.findAll();
        model.addAttribute("customerType",customerTypes);
        model.addAttribute("customerDto",new CustomerDto());
        return "customer/inputFormCustomer";
    }
    @PostMapping("/createCustomer")
    public String createCustomer(@ModelAttribute @Validated CustomerDto customerDto , BindingResult bindingResult, Model model){
        new CustomerDto().validate(customerDto,bindingResult);
        if (bindingResult.hasFieldErrors()){
            List<CustomerType> customerTypes = iCustomerTypeService.findAll();
            model.addAttribute("customerType",customerTypes);
            return "customer/inputFormCustomer";
        }else {
            Customer customer = new Customer();
            BeanUtils.copyProperties(customerDto,customer);
            model.addAttribute("message", "Thêm mới thành  công");
            iCustomerService.save(customer);
        }
        return ("redirect:/customer");
    }
    @GetMapping("/showEditFormCustomer/{id}")
    public String formEdit(@PathVariable Long id , Model model){
        List<CustomerType> customerTypes = iCustomerTypeService.findAll();
       Customer customer =  iCustomerService.findById(id);
       CustomerDto customerDto = new CustomerDto();
       BeanUtils.copyProperties(customer,customerDto);
        System.out.println(customerDto);
       model.addAttribute("customerType",customerTypes);
       model.addAttribute("customerDto", customerDto);
       return "customer/editForm";
    }
    @PostMapping("/editCustomer")
    public String editComplete(@Valid @ModelAttribute CustomerDto customerDto){
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDto,customer);
        System.out.println(customer.getId());
        customer.setId(customerDto.getId());
        iCustomerService.save(customer);
        return "redirect:/customer";
    }
    @GetMapping("/delete")
    public String delete(Customer customer, RedirectAttributes redirectAttributes){
        iCustomerService.remove(customer);
        redirectAttributes.addFlashAttribute("message","Xóa Thành Công");
        return "redirect:/customer";
    }
    @GetMapping("/search-customer")
    public String searchCustomer(@PageableDefault(value = 5) Pageable pageable, @RequestParam String nameCustomer , Model model){
        Page<Customer> customerList = iCustomerService.searchByName(nameCustomer,pageable);
        model.addAttribute("customers",customerList);
        return "customer/listCustomer";
    }

}
