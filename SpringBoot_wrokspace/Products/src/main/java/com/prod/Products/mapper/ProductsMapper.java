package com.prod.Products.mapper;

import com.prod.Products.dto.ProductsDto;
import com.prod.Products.entity.Products;

import java.util.Date;

public class ProductsMapper {

    public static ProductsDto mapToProductsDto(Products products)
    {
        ProductsDto productsDto = new ProductsDto(
                products.getId(),
                products.getProductName(),
                products.getProductDescripition(),
                products.getPrice(),
                products.getQuantity(),
                products.getCategory(),
                products.getCreatedAt(),
                products.getUpdatedAt()
        );
        return productsDto;
    }

    public static Products mapToProducts(ProductsDto productsDto)
    {
        Products products = new Products(
                productsDto.getId(),
                productsDto.getProductName(),
                productsDto.getProductDescripition(),
                productsDto.getPrice(),
                productsDto.getQuantity(),
                productsDto.getCategory(),
                productsDto.getCreatedAt(),
                productsDto.getUpdatedAt()
        );
        return products;
    }
}
