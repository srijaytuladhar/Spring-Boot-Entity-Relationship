package com.example.sql.controller;


import com.example.sql.entity.Category;
import com.example.sql.entity.Product;
import com.example.sql.service.CategoryService;
import com.example.sql.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController
{
    @Autowired
    private CategoryService categoryService;







}
