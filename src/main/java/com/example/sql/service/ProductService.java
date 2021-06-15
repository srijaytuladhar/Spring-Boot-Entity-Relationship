package com.example.sql.service;

import com.example.sql.entity.Category;
import com.example.sql.entity.Product;
import com.example.sql.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> saveProducts(List<Product> products) {
        return productRepository.saveAll(products);
    }

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public Product getProductsById(int id) {
        if (productRepository.findById(id).isPresent()){
            return productRepository.findById(id).orElse(null);
        }
        else {
            return new Product();
        }
    }

    public Product getProductsByName(String name) {
        return productRepository.findByName(name);
    }

    public String deleteProduct(int id) {
        productRepository.deleteById(id);
        return "Product deleted!!";
    }

    public Product updateProduct(Product product) {
        Product existingProduct = productRepository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        return  productRepository.save(existingProduct);
    }


    public List<Product> getProductByCategory(String name){
        List<Product> products = new ArrayList<>();
        productRepository.findByCategoryName(name)
                .forEach(products::add);
        return products;
    }
    public List<Product> getAllProductByCategory(){
        List<Product> products = new ArrayList<>();
        productRepository.findAll()
                .forEach(products::add);
        return products;
    }

}
