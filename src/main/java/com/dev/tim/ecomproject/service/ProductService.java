package com.dev.tim.ecomproject.service;

import com.dev.tim.ecomproject.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {

    List<Product> getAllProducts();
    Product getProductById(int id);
    Product addProduct(Product product);
    Product updateProduct(int id, Product product);
    void deleteProduct(int id);
}
