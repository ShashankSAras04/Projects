package com.assignments.programs;
class RectDemo
{
    int Display(int len,int bre)
    {
        int area=len*bre;
        return area;
    }
}
public class AreaofRect
{
    public static void main(String[] args)
    {
        RectDemo obj1=new RectDemo();
        int val=obj1.Display(2,5);
        System.out.println(val);
    }
}
