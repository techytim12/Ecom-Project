package com.dev.tim.ecomproject.service;

import com.dev.tim.ecomproject.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {

    Page<Product> getAllProducts(int offset, int pageSize);
    Product getProductById(int id);
    Product addProduct(Product product);
    Product updateProduct(int id, Product product);
    void deleteProduct(int id);
}
