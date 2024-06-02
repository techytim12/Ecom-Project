package com.dev.tim.ecomproject.controller;

import com.dev.tim.ecomproject.model.Product;
import com.dev.tim.ecomproject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts(){
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id){
        return ResponseEntity.ok(productService.getProductById(id));
    }

    @PostMapping("/product")
    public ResponseEntity<Product> addProduct(@RequestBody Product product){
        return ResponseEntity.ok(productService.addProduct(product));
    }

    @PatchMapping("/product/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable int id, @RequestBody Product product){
        return ResponseEntity.ok(productService.updateProduct(id, product));
    }

    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable int id){
        productService.deleteProduct(id);
    }
}
