package com.prod.Products.controller;

import com.prod.Products.dto.ProductsDto;
import com.prod.Products.service.ProductsService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductsController {
    @Autowired
    private ProductsService service;

    @PostMapping("/addproduct")
    public ResponseEntity<ProductsDto> saveProducts(@RequestBody ProductsDto productsDto)
    {
        return new ResponseEntity<>(service.createProducts(productsDto), HttpStatus.CREATED);
    }

    @GetMapping("/getallproduct")
    public ResponseEntity<List<ProductsDto>> getAllProducts()
    {
        return new ResponseEntity<>(service.getAllProducts(),HttpStatus.OK);
    }

    @GetMapping("/getproductbyid/{id}")
    public ResponseEntity<ProductsDto> getproductbyid(@PathVariable("id") String productid)
    {
        return new ResponseEntity<>(service.getById(productid),HttpStatus.OK);
    }

    @PutMapping("updateproductbyid/{id}")
    public ResponseEntity<ProductsDto>modifyProducts(@PathVariable String id,@RequestBody ProductsDto productsDto)
    {
        return new ResponseEntity<>(service.updateById(id,productsDto),HttpStatus.OK);
    }

    @DeleteMapping("deleteproductbyid/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable String id)
    {
        service.deleteById(id);
        return new ResponseEntity<>("The Employee with id "+id+" has deleted Successfully!!!",HttpStatus.OK);
    }


}
