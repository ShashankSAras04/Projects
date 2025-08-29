package com.test.programs;

class FactEg
{
    void Display(int a)
    {
        int multi=1;
        for(int i=a;i>=1;i--)
        {
            multi=multi*i;
        }
        System.out.println("Fact of "+a+"is "+multi);
    }
}
public class FactDemo {
    public static void main(String[] args) {
        FactEg obj1=new FactEg();
        obj1.Display(4);
        obj1.Display(5);
    }
}
