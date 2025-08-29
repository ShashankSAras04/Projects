package com.gentech.demo;

public class Flower {
    private String FName;
    private String FColor;
    private int NOofPetals;

    public Flower(){

    }

    public Flower(String FName, String FColor, int NOofPetals) {
        this.FName = FName;
        this.FColor = FColor;
        this.NOofPetals = NOofPetals;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public int getNOofPetals() {
        return NOofPetals;
    }

    public void setNOofPetals(int NOofPetals) {
        this.NOofPetals = NOofPetals;
    }

    public String getFColor() {
        return FColor;
    }

    public void setFColor(String FColor) {
        this.FColor = FColor;
    }
}
