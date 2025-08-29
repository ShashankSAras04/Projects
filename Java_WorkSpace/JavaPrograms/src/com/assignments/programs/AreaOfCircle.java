package com.assignments.programs;
class CircleDemo
{
    double display(int num)
    {
        double result =0;
        float res=(22f/7);
        return result = (res*(num*num));
    }
}

public class AreaOfCircle {
    public static void main(String[] args) {
        CircleDemo obj=new CircleDemo();
        double val=obj.display(4);
        System.out.println(val);
    }
}
