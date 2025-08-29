package com.constructor.programs;

class Fruits{
    String FruitName;
    String FruitColor;
    String FruitWieght;
    String FruitShape;
    Fruits(){
        FruitName="Orange";
        FruitColor="Saffron color";
        FruitShape="Oval Shape";
        FruitWieght="80 Grams";
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
    Flowers(){
        FlowerName="LiLy";
        FlowerColor="White";
        FlowerSeason="Early Summer or Late Summer";
        NoOfPetals="4 Petals";
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
    Vegetables(){
        VegName="Bringal";
        VegColor="Light Blue";
        VegWieght="90 Grams";
        VegSeason="All Seasons";
        System.out.println("Vegetable Name : "+VegName);
        System.out.println("Vegetable Color : "+VegColor);
        System.out.println("Vegetable Season : "+VegSeason);
        System.out.println("Vegetable Weight : "+VegWieght);
    }
}
public class CharacterDemo {
    public static void main(String[] args) {
        Fruits obj1=new Fruits();
        Flowers obj2=new Flowers();
        Vegetables obj3=new Vegetables();

    }
}
