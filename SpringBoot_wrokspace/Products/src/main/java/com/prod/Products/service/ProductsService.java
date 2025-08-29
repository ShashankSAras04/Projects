package com.prod.Products.service;

import com.prod.Products.dto.ProductsDto;

import java.util.List;

public interface ProductsService {
    ProductsDto createProducts(ProductsDto productsDto);

    List<ProductsDto> getAllProducts();

    ProductsDto getById(String id);

    ProductsDto updateById(String id,ProductsDto productsDto);

    void deleteById(String productsId);
}
