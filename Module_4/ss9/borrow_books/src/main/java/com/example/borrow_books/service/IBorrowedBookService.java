package com.example.borrow_books.service;

import com.example.borrow_books.model.BorrowedBook;

public interface IBorrowedBookService {
    void save(BorrowedBook borrowedBook);

    BorrowedBook findByborrowedNumber(String number);
    void delete(BorrowedBook borrowedBook);
}
