package com.gentech.demo;

public class Product {
    private int ProdId;
    private String ProdName;
    private Double Cost;


    public Product(){

    }

    public Product(int prodId, Double cost, String prodName) {
        ProdId = prodId;
        Cost = cost;
        ProdName = prodName;
    }

    public int getProdId() {
        return ProdId;
    }

    public void setProdId(int prodId) {
        ProdId = prodId;
    }

    public String getProdName() {
        return ProdName;
    }

    public void setProdName(String prodName) {
        ProdName = prodName;
    }

    public Double getCost() {
        return Cost;
    }

    public void setCost(Double cost) {
        Cost = cost;
    }
}
