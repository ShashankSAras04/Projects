package com.prod.Products.serviceimpl;

import com.prod.Products.dto.ProductsDto;
import com.prod.Products.entity.Products;
import com.prod.Products.exception.ResourceNotFoundException;
import com.prod.Products.mapper.ProductsMapper;
import com.prod.Products.repository.ProductRepository;
import com.prod.Products.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductsServiceImpl implements ProductsService {
    @Autowired
    private ProductRepository products;

    @Override
    public ProductsDto createProducts(ProductsDto productsDto) {
        Products addproducts= ProductsMapper.mapToProducts(productsDto);
        Products savedProducts = products.save(addproducts);
        return ProductsMapper.mapToProductsDto(savedProducts);
    }

    @Override
    public List<ProductsDto> getAllProducts() {
        return products.findAll().stream().map((products -> ProductsMapper.mapToProductsDto(products))).collect(Collectors.toList());
    }

    @Override
    public ProductsDto getById(String id) {
        Products getproductbyid = products.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("The Entered id "+id+" is not available"));
        return ProductsMapper.mapToProductsDto(getproductbyid);
    }

    @Override
    public ProductsDto updateById(String id, ProductsDto productsDto) {
        Products updateproducts=products.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("The Employee id "+id+" is not available"));
        updateproducts.setId(id);
        updateproducts.setProductName(productsDto.getProductName());
        updateproducts.setProductDescripition(productsDto.getProductDescripition());
        updateproducts.setPrice(productsDto.getPrice());
        updateproducts.setQuantity(productsDto.getQuantity());
        updateproducts.setCategory(productsDto.getCategory());

        Products saveProducts=products.save(updateproducts);

        return ProductsMapper.mapToProductsDto(saveProducts);
    }

    @Override
    public void deleteById(String id) {
        Products deleteproduct=products.findById(id).orElseThrow(()->
                new ResourceNotFoundException("The Product id "+id+" is not Available"));
        products.delete(deleteproduct);
    }


}
