package com.sonduong.controller;

import com.sonduong.model.Product;
import com.sonduong.service.IProduct;
import com.sonduong.service.ProductImp;
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
    @PostMapping("/save")
    public String save(Product product){
        product.setId((int) (Math.random() * 10000));
        return "redirect:/";
    }
    @GetMapping("/product/{id}/edit")
    public String edit(@PathVariable  int id, Model model) {
        model.addAttribute("product", product.findById(id));
        return "edit";
    }
    @GetMapping("/product/{id}/delete")
    public String delete(Product product1, RedirectAttributes redirect) {
        product.delete(product1.getId());
        redirect.addAttribute("success", "Removed customer successfully!");
        return "redirect:/";
    }
    @PostMapping("/update")
    public String update(Product product1) {
        product.update(product1.getId(), product1);
        return "redirect:/";
    }
    @GetMapping("product/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("product", product.findById(id));
        return "infor";
    }
}
