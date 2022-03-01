package sonduong.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // đánh dấu 1 class là controller
public class HelloController {
    // handle method chuyên xử lý request từ người dùng
    @RequestMapping("/hello")
    public String showHelloPage(Model model, ModelMap modelMap){
        model.addAttribute("studentName", "son" );
        modelMap.addAttribute("studentAge", 23);
        return "hello";
    }
}
