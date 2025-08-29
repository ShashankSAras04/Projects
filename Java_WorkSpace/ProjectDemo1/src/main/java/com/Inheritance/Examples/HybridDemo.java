package com.Inheritance.Examples;
class Sample
{
    void Display()
    {
        System.out.println("Super class");
    }
}
class ChildClassOne extends Sample
{
    void ChildDisplayOne()
    {
        System.out.println("1st Child class of Sample Class");
    }
}
class ChildClassTwo extends Sample
{
    void ChildDisplayTwo()
    {
        System.out.println("2nd Child class of Sample Class");
    }
}
class ChildClass extends ChildClassTwo
{
    void ChildDisplay()
    {
        System.out.println("Child class of ChildClassTwo Class");
    }
}
public class HybridDemo {
    public static void main(String[] args) {
        ChildClass o=new ChildClass();
        o.ChildDisplay();
        ChildClassTwo ob1=new ChildClassTwo();
        ob1.ChildDisplayTwo();
        ChildClassOne ob2=new ChildClassOne();
        ob2.ChildDisplayOne();
        ob2.Display();
    }
}
