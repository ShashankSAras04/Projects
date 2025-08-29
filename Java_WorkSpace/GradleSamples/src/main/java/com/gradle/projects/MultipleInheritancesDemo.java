package com.gradle.projects;
interface addition
{
    void add(int x,int y);
}
interface substraction
{
    void sub(int p,int q);
}
interface multiplication
{
    void multi(int a,int b);
}
interface division
{
    void div(int m,int n);
}
class Calculator implements addition,substraction,multiplication,division
{
    public void add(int x,int y)
    {
        int result=(x+y);
        System.out.println("Addition "+result);
    }
    public void sub(int p,int q)
    {
        int result=(q-p);
        System.out.println("Substraction "+result);
    }
    public void multi(int a,int b)
    {
        int result=(a*b);
        System.out.println("Multiplication "+result);
    }
    public void div(int m,int n)
    {
        int result=(m/n);
        System.out.println("Division "+result);
    }

}
public class MultipleInheritancesDemo
{
    public static void main(String[] args)
    {
        Calculator ob=new Calculator();
        ob.add(10,20);
        ob.sub(20,30);
        ob.multi(20,30);
        ob.div(10,2);
    }
}
