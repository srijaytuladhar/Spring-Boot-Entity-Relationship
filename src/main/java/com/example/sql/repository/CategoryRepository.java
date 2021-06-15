package com.example.sql.repository;

import com.example.sql.entity.Category;
import com.example.sql.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoryRepository extends CrudRepository<Category, Integer> {

    //  public List<Category> findByProductId(int productId);
    // public List<Category> findByProductName(String name);

}
