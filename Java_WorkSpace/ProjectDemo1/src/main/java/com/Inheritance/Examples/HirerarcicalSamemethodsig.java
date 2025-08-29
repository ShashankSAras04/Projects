package com.Inheritance.Examples;


class Numbers
{
    void Display(int num)
    {
        System.out.println("Parent class Number "+num);
    }
}
class Tables extends Numbers
{
    Tables(int num1)
    {
        super.Display(num1);
    }
    void Display(int num)
    {
        System.out.println("1st Child Class Number "+num);
    }
}
class Squares extends Numbers
{
    Squares(int num2)
    {
        super.Display(num2);
    }
    void Display(int num)
    {
        System.out.println("2nd child Class number "+num);
    }
}
public class HirerarcicalSamemethodsig {
    public static void main(String[] args) {
        Squares ob=new Squares(10);
        ob.Display(20);
        Tables ob2=new Tables(30);
        ob.Display(40);
    }
}
