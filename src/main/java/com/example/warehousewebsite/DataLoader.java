package com.example.warehousewebsite;

import com.project.warehouse.entity.*;
import com.project.warehouse.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    @Value("${spring.sql.init.mode}")
    private String initialMode;

    final CategoryRepository categoryRepository;
    final WarehouseRepository warehouseRepository;
    final MeasurementRepository measurementRepository;
    final ProductRepository productRepository;
    final CurrencyRepository currencyRepository;
    final SupplierRepository supplierRepository;
    final ClientRepository clientRepository;
    final UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        if (initialMode.equals("always")) {
            Category category = categoryRepository.save(
                    new Category(1L, true, "Products", null));
            Measurement measurement = measurementRepository.save(
                    new Measurement(1L, true, "ta"));
//            productRepository.save(new Product(1L, true, 2L, "Nimadir", category, measurement));
            currencyRepository.save(new Currency(1L, true, "Dollar"));
            warehouseRepository.save(new Warehouse(1L, true, "Omborxona"));
            supplierRepository.save(new Supplier(1L, true, "Digger", "+998977777976"));
            clientRepository.save(new Client(1L, "Muzafar", "+998977667779", true));
            User user=new User();
            BCryptPasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
            user.setFirstName("Marco");
            user.setLastName("Forever");
            user.setPassword(passwordEncoder.encode("12345678"));
            user.setPhoneNumber("+998977677976");
            userRepository.save(user);
//            user=new User();
//            user.setLastName("To'rayev");
//            user.setFirstName("Jafarbek");
//            user.setPhoneNumber("+998912455897");
//            user.setPassword(passwordEncoder.encode("fVPHS9Chre7YCBp"));
//            userRepository.save(user);
        }

    }

}
