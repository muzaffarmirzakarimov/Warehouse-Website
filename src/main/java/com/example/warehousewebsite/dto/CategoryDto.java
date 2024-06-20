package com.example.warehousewebsite.dto;

import lombok.Data;

@Data
public class CategoryDto {
    private String name;
    private String parentCategoryId;
}
