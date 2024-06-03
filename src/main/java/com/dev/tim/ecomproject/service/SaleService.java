package com.dev.tim.ecomproject.service;

import com.dev.tim.ecomproject.model.Sale;

public interface SaleService {

    double getTotalRevenue();
    double getRevenueByProduct(int productId);
    Sale addSale(Sale sale);
}
