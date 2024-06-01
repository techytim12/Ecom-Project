package com.dev.tim.ecomproject.service.impl;

import com.dev.tim.ecomproject.exception.ProductNotFoundException;
import com.dev.tim.ecomproject.model.Product;
import com.dev.tim.ecomproject.repository.ProductRepository;
import com.dev.tim.ecomproject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(int id) {
        return productRepository.findById(id).orElseThrow(
                () -> new ProductNotFoundException("Product not found for id: "+ id)
        );
    }

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(int id, Product product) {
        Product savedProduct = productRepository.findById(id).orElseThrow(
                () -> new ProductNotFoundException("Product not found for id: "+ id)
        );

        savedProduct.setName(product.getName());
        savedProduct.setDescription(product.getDescription());
        savedProduct.setPrice(product.getPrice());
        savedProduct.setQuantity(product.getQuantity());

        return productRepository.save(savedProduct);

    }

    @Override
    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }
}
