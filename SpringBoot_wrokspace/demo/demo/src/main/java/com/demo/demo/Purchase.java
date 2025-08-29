package com.gentech.demo;

public class Purchase {
    private String Item;
    private String Quantity;
    private int Amount;

    public Purchase(){

    }

    public Purchase(String item, String quantity, int amount) {
        Item = item;
        Quantity = quantity;
        Amount = amount;
    }

    public String getItem() {
        return Item;
    }

    public void setItem(String item) {
        Item = item;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String quantity) {
        Quantity = quantity;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }
}
