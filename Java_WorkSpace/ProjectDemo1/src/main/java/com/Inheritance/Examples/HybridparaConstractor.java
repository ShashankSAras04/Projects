package com.Inheritance.Examples;
class Environment
{
    Environment(String name,int num)
    {
        System.out.println("Environment name "+name);
        System.out.println("Number of Seasons "+num);
    }
}
class Vegetables extends Environment{
    Vegetables(String seasonname ,int numberofseason,String name,int weight)
    {
        super(seasonname,numberofseason);
        System.out.println("Vegetables name "+name);
        System.out.println("Weigth of "+name+" is "+weight+" Grams");
    }
}
class Flowers extends Environment{
    Flowers(String seasonname,int numberofseasons,String name)
    {
        super(seasonname,numberofseasons);
        System.out.println("Flowers Name "+name);
    }
    
}
class Colors extends Flowers{
    Colors(String seasonsname, int numberseasons,String color,String Flname)
    {
        super(seasonsname,numberseasons,Flname);
        System.out.println("Flower Colors "+color);
    }
    
}
public class HybridparaConstractor {
    public static void main(String[] args) {
        Colors ob=new Colors("Winter",4,"Color","Liliy");
        Vegetables ob2=new Vegetables("Summer",4,"Bringal",10);
    }
}
