package com.staticprograms.example;

class DivideDemo
{
    static int[] Display(int num1,int num2)
    {
        int size=0;
        for(int i=num1;i<=num2;i++)
        {
            if((i%3)==0)
            {
                size++;
            }
        }
        int[] c=new int[size];
        int j=0;
        for (int i = num1; i <= num2; i++)
        {
            if (i % 3 == 0)
            {
                c[j] = i;
                j++;
            }
        }
        return c;
    }
}
public class StaticDivisibleBy3 {
    public static void main(String[] args) {
        int d[]=DivideDemo.Display(30,3000);
        for(int k:d)
        {
            System.out.println(k);
        }
    }
}
