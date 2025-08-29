package com.prod.Products.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductsDto {
    private String id;
    private String productName;
    private String productDescripition;
    private double price;
    private Integer quantity;
    private String category;
    private Date createdAt;
    private Date updatedAt;
}
