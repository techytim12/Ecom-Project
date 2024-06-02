package com.dev.tim.ecomproject.repository;

import com.dev.tim.ecomproject.model.Product;
import com.dev.tim.ecomproject.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Integer> {

    List<Sale> findAllById(int productId);
}
