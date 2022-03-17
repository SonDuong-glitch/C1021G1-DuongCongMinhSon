package com.example.borrow_books.model;

import org.springframework.stereotype.Controller;

import javax.persistence.*;
import java.util.List;


@Entity
public class Book {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private int quantity;
    private int currentQuantity;
    private String name;
    @OneToMany(mappedBy = "book")
    private List<BorrowedBook> borrowedBook;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCurrentQuantity() {
        return currentQuantity;
    }

    public void setCurrentQuantity(int currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BorrowedBook> getBorrowedBook() {
        return borrowedBook;
    }

    public void setBorrowedBook(List<BorrowedBook> borrowedBook) {
        this.borrowedBook = borrowedBook;
    }

    public Book() {
    }

    public Book(Long id, int quantity, int currentQuantity, String name, List<BorrowedBook> borrowedBook) {
        this.id = id;
        this.quantity = quantity;
        this.currentQuantity = currentQuantity;
        this.name = name;
        this.borrowedBook = borrowedBook;
    }
}
