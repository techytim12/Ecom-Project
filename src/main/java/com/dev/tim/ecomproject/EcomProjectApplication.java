package com.dev.tim.ecomproject;

import com.dev.tim.ecomproject.model.Product;
import com.dev.tim.ecomproject.model.Sale;
import com.dev.tim.ecomproject.service.ProductService;
import com.dev.tim.ecomproject.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;


@SpringBootApplication()
public class EcomProjectApplication implements CommandLineRunner {

	private final ProductService productService;
	private final SaleService saleService;

	public EcomProjectApplication(ProductService productService, SaleService saleService) {
		this.productService = productService;
		this.saleService = saleService;
	}

	public static void main(String[] args) {
		SpringApplication.run(EcomProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Product product1 = new Product(1, "Product1", "Description for Product1", 100, 1000);
		Product product2 = new Product(2, "Product2", "Description for Product2", 50, 2000);

		productService.addProduct(product1);
		productService.addProduct(product2);

		Sale sale1 = new Sale(101, 1, 5, LocalDate.now(), 500);
		Sale sale2 = new Sale(102, 2, 10, LocalDate.now(), 500);
		Sale sale3 = new Sale(103, 2, 20, LocalDate.now(), 1000);

		saleService.addSale(sale1);
		saleService.addSale(sale2);
		saleService.addSale(sale3);

		System.out.println("Total Revenue: " + saleService.getTotalRevenue());
		System.out.println("Revenue for Product 2: " + saleService.getRevenueByProduct(2));
	}
}
