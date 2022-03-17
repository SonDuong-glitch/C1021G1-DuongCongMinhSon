package com.example.borrow_books.service;

import com.example.borrow_books.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBookService {
    Page<Book> findAll(Pageable pageable);
    void save(Book book);
    void delete(Book book);
    Book findById(Long id);
}
