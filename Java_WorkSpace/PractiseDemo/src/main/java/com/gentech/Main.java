package com.gentech;

public class Main {
    public static void main(String[] args)
    {
        Extended ob=new Extended();
        ob.Addition(10,20);

    }
}
abstract class Addition
{
    abstract void Addition(int a,int b);
}
class Extended extends Addition
{
    void Addition(int a,int b)
    {
        System.out.println(a+b);
    }
}
