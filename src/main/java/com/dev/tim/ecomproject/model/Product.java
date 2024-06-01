package com.dev.tim.ecomproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

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
}
