package com.paraconst.programs;

class Fruits{
    String FruitName;
    String FruitColor;
    String FruitWieght;
    String FruitShape;
    Fruits(String name,String Color,String wieght,String shape){
        FruitName=name;
        FruitColor=Color;
        FruitShape=wieght;
        FruitWieght=shape;
        System.out.println("Fruit Name : "+FruitName);
        System.out.println("Fruit Color : "+FruitColor);
        System.out.println("Fruit Shape : "+FruitShape);
        System.out.println("Fruit Weight : "+FruitWieght);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
    }

}

class Flowers{
    String FlowerName;
    String FlowerColor;
    String FlowerSeason;
    String NoOfPetals;
    Flowers(String name,String color,String season,String petals){
        FlowerName=name;
        FlowerColor=color;
        FlowerSeason=season;
        NoOfPetals=petals;
        System.out.println("Flower Name : "+FlowerName);
        System.out.println("Flower Color : "+FlowerColor);
        System.out.println("Flower Season : "+FlowerSeason);
        System.out.println("Flower Number of Petals : "+NoOfPetals);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
    }
}

class Vegetables{
    String VegName;
    String VegColor;
    String VegWieght;
    String VegSeason;
    Vegetables(String name,String color,String wieght,String season){
        VegName=name;
        VegColor=color;
        VegWieght=wieght;
        VegSeason=season;
        System.out.println("Vegetable Name : "+VegName);
        System.out.println("Vegetable Color : "+VegColor);
        System.out.println("Vegetable Season : "+VegSeason);
        System.out.println("Vegetable Weight : "+VegWieght);
    }
}
public class CharacterparaDemo {
    public static void main(String[] args) {
        Fruits obj1=new Fruits("Orange","Orange Color","70 Grams","Oval");
        Flowers obj2=new Flowers("Lily","White Color","All Seasons","4 Petals");
        Vegetables obj3=new Vegetables("Bringal","Blue","90 Grams","All Seasons");

    }
}
