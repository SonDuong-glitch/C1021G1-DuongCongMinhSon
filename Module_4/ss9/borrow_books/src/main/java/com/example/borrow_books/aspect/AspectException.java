package com.example.borrow_books.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectException {
    private int num = 0;
    @Pointcut("execution(* com.example.borrow_books.controller.BookController.payBook(..))")
    public void afterPayBookController(){
    }
    @AfterThrowing("afterPayBookController()")
    public void throwaffterPayBookController(){
        System.out.println("mã đã nhập không đúng");
    }
    @Pointcut("execution(* com.example.borrow_books.controller.BookController.showFormBorrow(..))")
    public void afterBorrowBookController(){
    }
    @AfterThrowing("afterBorrowBookController()")
    public void throwAfterBorrowBookController(){
        System.out.println("Sách đã hết");
    }
    @Pointcut("execution(* com.example.borrow_books.controller.BookController.*(..))")
    public void afterVisittedController(){
    }

    @After("afterVisittedController()")
    public void throwAfterVisittedController(){
        num++;
        System.out.println("Số lượt truy cập hiện tại là "+ num);
    }

}
