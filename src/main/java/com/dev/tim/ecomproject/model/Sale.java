package com.dev.tim.ecomproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Sale {

    @Id
    private int id;
    private int productId;
    private int quantity;
    private LocalDate saleDate;
    private double amount;

    public Sale(){}

    public Sale(int id, int productId, int quantity, LocalDate saleDate, double amount) {
        this.id = id;
        this.productId = productId;
        this.quantity = quantity;
        this.saleDate = saleDate;
        this.amount = amount;
    }
}