package com.example.borrow_books.service.impl;

import com.example.borrow_books.model.BorrowedBook;
import com.example.borrow_books.reponsitory.IBorrowedBookRepository;
import com.example.borrow_books.service.IBorrowedBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrowedBookService implements IBorrowedBookService {
    @Autowired
    private IBorrowedBookRepository borrowedBookRepository;
    @Override
    public void save(BorrowedBook borrowedBook) {
        borrowedBookRepository.save(borrowedBook);
    }

    @Override
    public BorrowedBook findByborrowedNumber(String number) {
        return borrowedBookRepository.findBorrowedBookByBorrowedNumberContaining(number);
    }

    @Override
    public void delete(BorrowedBook borrowedBook) {
        borrowedBookRepository.delete(borrowedBook);
    }
}
