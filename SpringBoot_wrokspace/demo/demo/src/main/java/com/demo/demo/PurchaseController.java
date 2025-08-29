package com.gentech.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class PurchaseController {
    @GetMapping("/Purchase")
    public Purchase getPurchase(){
        Purchase pur=new Purchase("Wheat","2 KG",150);
        return pur;
    }

    @GetMapping("/Purchase1")
    public Purchase getPurchase1(){
        Purchase pur=new Purchase();
        pur.setItem("Ragi");
        pur.setQuantity("1 KG");
        pur.setAmount(100);
        return pur;
    }

    @GetMapping("/Purchases")
    public List<Purchase> getAllPurchase() {
        List<Purchase> pr = new ArrayList<>();
        pr.add(new Purchase("Greengram","5 KG",400));
        pr.add(new Purchase("Sugar","4KG",200));
        pr.add(new Purchase("Rice","8KG",500));
        return pr;
    }
}
