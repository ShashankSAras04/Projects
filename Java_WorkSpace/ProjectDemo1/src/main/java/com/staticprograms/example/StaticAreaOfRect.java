package com.staticprograms.example;

class RectDemo
{
    static int Display(int len,int bre)
    {
        int area=len*bre;
        return area;
    }
}
public class StaticAreaOfRect
{
    public static void main(String[] args)
    {
        int val=RectDemo.Display(2,5);
        System.out.println(val);
    }
}

