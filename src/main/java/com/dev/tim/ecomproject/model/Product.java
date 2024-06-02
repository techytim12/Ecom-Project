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
}



/*
*
*   Product     Sales
*   1           M
*   M            1
*
* */
