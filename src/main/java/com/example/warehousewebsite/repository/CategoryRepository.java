package com.example.warehousewebsite.repository;

import com.project.warehouse.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    List<Category> findAllByActiveTrue();
}