package com.example.borrow_books.reponsitory;

import com.example.borrow_books.model.BorrowedBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBorrowedBookRepository extends JpaRepository<BorrowedBook,Long> {
    BorrowedBook findBorrowedBookByBorrowedNumberContaining(String number);
}
