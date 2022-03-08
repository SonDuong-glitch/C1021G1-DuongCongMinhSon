package com.example.blog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nameOfBlog;
    private String content;

    public Blog() {
    }

    public Blog(int id, String nameOfBlog, String content) {
        this.id = id;
        this.nameOfBlog = nameOfBlog;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
}
