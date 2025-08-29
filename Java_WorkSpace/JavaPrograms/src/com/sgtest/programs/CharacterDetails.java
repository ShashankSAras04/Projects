package com.sgtest.programs;

import java.util.concurrent.Flow;

class Fruits{
    String FruitName;
    String FruitColor;
    String FruitWieght;
    String FruitShape;
}

class Flowers{
    String FlowerName;
    String FlowerColor;
    String FlowerSeason;
    String NoOfPetals;
}

class Vegetables{
    String VegName;
    String VegColor;
    String VegWieght;
    String VegSeason;
}
public class CharacterDetails {
    public static void main(String[] args) {
        Fruits obj1=new Fruits();
        obj1.FruitName="Orange";
        obj1.FruitColor="Saffron color";
        obj1.FruitShape="Oval Shape";
        obj1.FruitWieght="80 Grams";
        System.out.println("Fruit Name : "+obj1.FruitName);
        System.out.println("Fruit Color : "+obj1.FruitColor);
        System.out.println("Fruit Shape : "+obj1.FruitShape);
        System.out.println("Fruit Weight : "+obj1.FruitWieght);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        Flowers obj2=new Flowers();
        obj2.FlowerName="LiLy";
        obj2.FlowerColor="White";
        obj2.FlowerSeason="Early Summer or Late Summer";
        obj2.NoOfPetals="4 Petals";
        System.out.println("Flower Name : "+obj2.FlowerName);
        System.out.println("Flower Color : "+obj2.FlowerColor);
        System.out.println("Flower Season : "+obj2.FlowerSeason);
        System.out.println("Flower Number of Petals : "+obj2.NoOfPetals);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        Vegetables obj3=new Vegetables();
        obj3.VegName="Bringal";
        obj3.VegColor="Light Blue";
        obj3.VegWieght="90 Grams";
        obj3.VegSeason="All Seasons";
        System.out.println("Vegetable Name : "+obj3.VegName);
        System.out.println("Vegetable Color : "+obj3.VegColor);
        System.out.println("Vegetable Season : "+obj3.VegSeason);
        System.out.println("Vegetable Weight : "+obj3.VegWieght);
   }
}
