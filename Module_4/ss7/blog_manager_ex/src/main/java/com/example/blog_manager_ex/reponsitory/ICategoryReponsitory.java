package com.example.blog_manager_ex.reponsitory;

import com.example.blog_manager_ex.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryReponsitory extends JpaRepository<Category,Long> {

}
