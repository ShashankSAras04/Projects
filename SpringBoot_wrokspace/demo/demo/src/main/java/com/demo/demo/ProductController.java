package com.gentech.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class ProductController {
    @GetMapping("/Product")
    public Product getProduct(){
        Product pt=new Product(1567,25768.6,"Laptop");
        return pt;
    }

    @GetMapping("/Product1")
    public Product getProduct1(){
        Product pt=new Product();
        pt.setProdId(8765);
        pt.setProdName("iPhone");
        pt.setCost(55000.45);
        return pt;
    }

    @GetMapping("/Products")
    public List<Product> getAllProducts() {
        List<Product> pdt = new ArrayList<>();
        pdt.add(new Product(8765,345.5 , "Earphones"));
        pdt.add(new Product(6578, 3098.4, "Bluetooth"));
        pdt.add(new Product(3456,456.45, "ChragerPoint"));
        return pdt;
    }
}
