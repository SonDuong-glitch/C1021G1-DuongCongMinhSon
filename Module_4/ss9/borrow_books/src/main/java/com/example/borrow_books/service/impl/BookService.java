package com.example.borrow_books.service.impl;

import com.example.borrow_books.model.Book;
import com.example.borrow_books.reponsitory.IBookReponsitory;
import com.example.borrow_books.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BookService implements IBookService {
    @Autowired
    private IBookReponsitory bookRepository ;
    @Override
    public Page<Book> findAll(Pageable pageable) {
        return bookRepository.findAll(pageable);
    }

    @Override
    public void save(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void delete(Book book) {
        bookRepository.delete(book);
    }

    @Override
    public Book findById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }
}
