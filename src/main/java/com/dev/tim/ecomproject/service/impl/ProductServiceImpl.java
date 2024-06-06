package com.dev.tim.ecomproject.service.impl;

import com.dev.tim.ecomproject.exception.ProductNotFoundException;
import com.dev.tim.ecomproject.model.Product;
import com.dev.tim.ecomproject.repository.ProductRepository;
import com.dev.tim.ecomproject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Page<Product> getAllProducts(int offset, int pageSize) {
        Page<Product> productPage = productRepository.findAll(PageRequest.of(offset, pageSize));
        if(productPage.isEmpty()){
            throw new ProductNotFoundException("No Products found!");
        }
        return productPage;
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
