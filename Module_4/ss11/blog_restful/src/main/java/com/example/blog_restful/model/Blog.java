package com.example.blog_restful.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Date;
@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nameOfBlog;
    private String content;
    private String author;
    private Date localDate;

    @ManyToOne
    @JoinColumn(name = "idCategory",referencedColumnName = "id")
    @JsonBackReference
    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Blog() {
    }

    public Blog(Long id, String nameOfBlog, String content, String author, Date localDate) {
        this.id = id;
        this.nameOfBlog = nameOfBlog;
        this.content = content;
        this.author = author;
        this.localDate = localDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameOfBlog() {
        return nameOfBlog;
    }

    public void setNameOfBlog(String nameOfBlog) {
        this.nameOfBlog = nameOfBlog;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getLocalDate() {
        return localDate;
    }

    public void setLocalDate(Date localDate) {
        this.localDate = localDate;
    }
}
