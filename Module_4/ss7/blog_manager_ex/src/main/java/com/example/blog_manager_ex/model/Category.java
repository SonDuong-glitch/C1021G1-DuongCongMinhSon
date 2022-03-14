package com.example.blog_manager_ex.model;

import javax.persistence.*;
import java.util.Set;
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String category;
    @OneToMany(mappedBy = "category")
    private Set<Blog> blogList;

    public Set<Blog> getBlogList() {
        return blogList;
    }

    public void setBlogList(Set<Blog> blogList) {
        this.blogList = blogList;
    }


    public Category() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setTopic(String topic) {
        this.category = category;
    }
}
