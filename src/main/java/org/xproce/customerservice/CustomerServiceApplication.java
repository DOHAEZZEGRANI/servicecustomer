package org.xproce.customerservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.xproce.customerservice.Dao.Repository.CustomerRepository;


import org.xproce.customerservice.Dao.Entities.Customer;


@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder().Name("fatii").Email("fati@gmail.com").build());
            customerRepository.save(Customer.builder().Name("doha").Email("doha@gmail.com").build());
        };

    }}
