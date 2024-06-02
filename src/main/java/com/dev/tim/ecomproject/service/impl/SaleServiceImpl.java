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
        List<Sale> allSales = saleRepository.findAll();

        double totalRevenue = 0;
        for(Sale sale : allSales){
            totalRevenue += sale.getAmount();
        }

        return totalRevenue;
    }

    @Override
    public double getRevenueByProduct(int productId) {

        List<Sale> saleProducts = saleRepository.findAllById(productId);

        double saleAmount = 0;
        for(Sale sale : saleProducts){
            saleAmount += sale.getAmount();
        }

        return saleAmount;
    }
}
