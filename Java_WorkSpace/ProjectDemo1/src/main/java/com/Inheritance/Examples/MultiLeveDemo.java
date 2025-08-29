package com.Inheritance.Examples;

class Addition
{
    void Display1(int i,int j){
        int result= i+j;
        System.out.println("Addition of Two Numbers"+result);
    }
}
class Substraction extends Addition
{
    void Display2(int p,int q){
        int result= q-p;
        System.out.println("Substraction of Two Numbers"+result);
    }
}
class Multiplication extends Substraction
{
    void Display3(int s, int p){
        int result= s*p;
        System.out.println("Multiplication of Two Numbers"+result);
    }
}
public class MultiLeveDemo {
    public static void main(String[] args) {
        Multiplication o=new Multiplication();
        o.Display1(10,20);
        o.Display2(20,30);
        o.Display3(20,10);
    }
}
