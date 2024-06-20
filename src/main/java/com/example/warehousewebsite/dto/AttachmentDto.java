package com.example.warehousewebsite.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AttachmentDto {
    private String name;
    private Long size;
    private String content_type;

}
