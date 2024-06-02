package com.dev.tim.ecomproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
public class Sale {

    @Id
    private int id;
    private int productId;
    private int quantity;
    private LocalDate saleDate;
}



/*
*   Product Sale
*   1       1
*   M       1
*
*   Sale    Product
*   1       M
*   M        1
* */
