package com.example.sql.controller;


import com.example.sql.entity.Category;
import com.example.sql.entity.Product;
import com.example.sql.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController
{
    @Autowired
    private ProductService productService;

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @PostMapping("/productsMultiple")
    public List<Product> addProducts(@RequestBody List<Product> products) {
        return productService.saveProducts(products);
    }

    @GetMapping("/products")
    public List<Product> findProducts() {
        return productService.getProducts();
    }

    @GetMapping("/productById/{id}")
    public Product findProductById(@PathVariable int id) {
        return productService.getProductsById(id);
    }

    @GetMapping("/products/{name}")
    public Product findProductByName(@PathVariable String name) {
        return productService.getProductsByName(name);
    }

    @PutMapping("/products")
    public Product updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }

    @DeleteMapping("/products/{id}")
    public String deleteProduct(@PathVariable int id) {
        return productService.deleteProduct(id);
    }


    @GetMapping("/products/categories/{name}")
    public List<Product> getProductByCategory(@PathVariable String name) {
        return productService.getProductByCategory(name);
    }

    @GetMapping("/products/categories")
    public List<Product> getAllCategory() {
        return productService.getAllProductByCategory();
    }


}
