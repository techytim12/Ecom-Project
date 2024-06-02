package com.dev.tim.ecomproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class EcomProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcomProjectApplication.class, args);
	}

}
