package com.example.sql.repository;

import com.example.sql.entity.Category;
import com.example.sql.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    Product findByName(String name);
    public List<Product> findByCategoryName(String name);

}
