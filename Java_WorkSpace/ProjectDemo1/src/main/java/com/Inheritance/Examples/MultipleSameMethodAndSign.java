package com.Inheritance.Examples;
class Mamals
{
    void Display(String name)
    {
        System.out.println("Mamal Name is "+name);
    }
}
class Animals extends Mamals{
    Animals(String AnimalName)
    {
        super.Display(AnimalName);
    }
    void Display(String name)
    {
        System.out.println("Animal Name is "+name);
    }


}
class Humans extends Animals{
    Humans(String Hname,String Hname1)
    {
        super(Hname);
        super.Display(Hname1);
    }
    void Display(String name)
    {
        System.out.println("Human name is "+name);
    }
}
public class MultipleSameMethodAndSign {
    public static void main(String[] args) {
        Humans ob=new Humans("Lion","2 Legs Human");
        ob.Display("Gaignt Human");

    }
}
