package com.example.borrow_books.controller;

import com.example.borrow_books.model.Book;
import com.example.borrow_books.model.BorrowedBook;
import com.example.borrow_books.model.Customer;
import com.example.borrow_books.service.IBookService;
import com.example.borrow_books.service.IBorrowedBookService;
import com.example.borrow_books.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BookController {
    @Autowired
    private IBookService iBookService;
    @Autowired
    private ICustomerService customerService;
    @Autowired
    private IBorrowedBookService borrowedBookService;
    @RequestMapping
    public String homeControl(Model model , @PageableDefault(value = 10)Pageable pageable){
        Page<Book> bookPage = iBookService.findAll(pageable);
        model.addAttribute("bookList",bookPage);
        return "book/list";
    }
    @GetMapping("/borrow-book")
    public ModelAndView showFormBorrow(){
        ModelAndView modelAndView = new ModelAndView("book/showFormBorrow");
      modelAndView.addObject("book",new Book());

      return modelAndView;
    }
    @PostMapping("/borrow-book")
    public String borrowBook(@ModelAttribute Book book){
        book.setCurrentQuantity(book.getQuantity());
        iBookService.save(book);
        return "redirect:/";
    }
    @GetMapping("/cart")
    public String showCart(@RequestParam Long id, RedirectAttributes redirectAttributes, Model model){
        Book book = iBookService.findById(id);
        if(book != null){
            if(book.getCurrentQuantity()>0){
                model.addAttribute("book", book);
                return "book/cart";
            }else{
                redirectAttributes.addFlashAttribute("message","sách đã hết");
             return "redirect:/";
            }
        }
        return "redirect:/";
    }
    @PostMapping("/cart")
    public String finishCart(@ModelAttribute Book book, @RequestParam String customerName,
                             RedirectAttributes redirectAttributes){
        book.setCurrentQuantity(book.getCurrentQuantity()-1);
        Customer customerId = customerService.findCustomerByName(customerName);
        BorrowedBook borrowedBook = new BorrowedBook(randomBorrowedNumber(),book,customerId);
        borrowedBookService.save(borrowedBook);
        redirectAttributes.addFlashAttribute("message","Borrow Book Success");
        iBookService.save(book);
        return "redirect:/";
    }
    @GetMapping("/give_book_back")
    public String showFormGiveBookBack(){
        return "book/give_back";
    }
    @PostMapping("give_book_back")
    public String payBook(@RequestParam String number,RedirectAttributes redirectAttributes) throws Exception {
        BorrowedBook borrowedBook = borrowedBookService.findByborrowedNumber(number);
        if(borrowedBook==null){
            throw  new NullPointerException("");
        }else {
            Long bookId = borrowedBook.getBook().getId();
            Book book = iBookService.findById(bookId);
            book.setCurrentQuantity(book.getCurrentQuantity()+1);
            iBookService.save(book);
            redirectAttributes.addFlashAttribute("message","give book back success");
            borrowedBookService.delete(borrowedBook);
            return "redirect:/";
        }

    }
    private int randomNumber(){
        int number = (int) Math.round(Math.random()*9);
        return number;
    }

    private String randomBorrowedNumber(){
        String result = "";
        for (int i = 0;i<5;i++){
            result +=randomNumber();
        }
        return result;
    }
}
