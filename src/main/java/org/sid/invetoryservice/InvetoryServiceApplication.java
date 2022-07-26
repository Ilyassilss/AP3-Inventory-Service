package org.sid.invetoryservice;

import org.sid.invetoryservice.entities.Product;
import org.sid.invetoryservice.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InvetoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InvetoryServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ProductRepository productRepository){
        return args -> {
            productRepository.save(new Product(null , "laptop" , 5000));
            productRepository.save(new Product(null , "Printer" , 3000));
            productRepository.save(new Product(null , "Macbook" , 15000));
            productRepository.findAll().forEach(System.out::println);
        };
    }
}
