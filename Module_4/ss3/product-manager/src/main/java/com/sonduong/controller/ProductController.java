package com.sonduong.controller;

import com.sonduong.model.Product;
import com.sonduong.service.IProduct;
import com.sonduong.service.ProductImp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class ProductController {
    private static IProduct product = new ProductImp();
    @GetMapping("")
    public String showList(Model model){
        List<Product> productList = product.listAll();
        model.addAttribute("product",productList);
        return "home";
    }
    @GetMapping("/create")
    public String showFormCreate(Model model){
        model.addAttribute("product", new Product());
        return "create";
    }

}
