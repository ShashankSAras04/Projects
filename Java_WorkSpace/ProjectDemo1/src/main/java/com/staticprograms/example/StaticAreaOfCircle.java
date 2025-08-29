package com.staticprograms.example;

class CircleDemo
{
    static double display(int num)
    {
        double result =0;
        float res=(22f/7);
        return result = (res*(num*num));
    }
}

public class StaticAreaOfCircle {
    public static void main(String[] args) {
        double val=CircleDemo.display(4);
        System.out.println(val);
    }
}

