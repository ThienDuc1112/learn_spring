package com.example.springboot.demo.repositories;

import com.example.springboot.demo.models.Category;
import com.example.springboot.demo.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
    List<Product> findByProductName(String productName);
    Iterable<Product> findByCategoryId(Long categoryId);
    Category findByCategory(Category category);
}
