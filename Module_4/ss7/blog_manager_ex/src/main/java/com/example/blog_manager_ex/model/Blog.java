package com.example.blog_manager_ex.model;

import javax.persistence.*;

@Entity
@Table
@NamedQuery(name = "findByName",query = "select c from Blog as c where  c.title =: name")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private Long time;
    private String category;
    @ManyToOne
    @JoinColumn(name ="category_id",referencedColumnName = "id")
    private Category categoryObj;

    public Blog() {
    }
    public Category getCategory1() {
        return categoryObj;
    }

    public void setCategory1(Category category) {
        this.categoryObj = categoryObj;
    }

    public Blog(Long id, String title, String content, Long time, String category) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.time = time;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
