package com.assignments.programs;

class AlphaDemo
{
    void Display(int c)
    {
        for(int i=c;i<=90;i++)
        {
            System.out.print((char)i+" ");
        }
    }
}
public class UpperCaseDemo {
    public static void main(String[] args) {
        int ch=65;
        AlphaDemo obj1=new AlphaDemo();
        obj1.Display(ch);
    }
}
