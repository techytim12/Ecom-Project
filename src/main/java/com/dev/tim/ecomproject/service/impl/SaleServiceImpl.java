package com.dev.tim.ecomproject.service.impl;

import com.dev.tim.ecomproject.model.Product;
import com.dev.tim.ecomproject.model.Sale;
import com.dev.tim.ecomproject.repository.SaleRepository;
import com.dev.tim.ecomproject.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleServiceImpl implements SaleService {

    @Autowired
    private SaleRepository saleRepository;

    @Override
    public double getTotalRevenue() {
        return saleRepository.findAll()
                .stream()
                .mapToDouble(Sale::getAmount)
                .sum();
    }

    @Override
    public double getRevenueByProduct(int productId) {

        return saleRepository.findAllByProductId(productId)
                .stream()
                .mapToDouble(Sale::getAmount)
                .sum();
    }

    public Sale addSale(Sale sale){
        return saleRepository.save(sale);
    }
}
