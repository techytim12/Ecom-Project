package com.dev.tim.ecomproject.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Product {

    @Id
    private int id;
    private String name;
    private String description;
    private double price;
    private int quantity;
    @OneToMany
    private List<Sale> sales;

    public Product(){}

    public Product(int id, String name, String description, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }
}