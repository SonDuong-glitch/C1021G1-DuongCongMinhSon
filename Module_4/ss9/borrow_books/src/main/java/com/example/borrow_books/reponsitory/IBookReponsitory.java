package com.example.borrow_books.reponsitory;

import com.example.borrow_books.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IBookReponsitory extends PagingAndSortingRepository<Book,Long> {
}
