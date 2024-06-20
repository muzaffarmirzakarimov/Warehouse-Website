package com.example.warehousewebsite.repository;

import com.project.warehouse.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    List<Supplier> findAllByActiveTrue();
}