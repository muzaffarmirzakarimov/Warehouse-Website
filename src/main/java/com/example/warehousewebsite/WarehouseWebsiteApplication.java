package com.example.warehousewebsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class WarehouseWebsiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(WarehouseWebsiteApplication.class, args);
    }

}
