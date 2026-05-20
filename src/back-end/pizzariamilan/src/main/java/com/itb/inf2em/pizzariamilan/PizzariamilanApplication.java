package com.itb.inf2em.pizzariamilan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PizzariamilanApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzariamilanApplication.class, args);

        System.out.println("Pizzariamilan started port 8080");

	}

}
