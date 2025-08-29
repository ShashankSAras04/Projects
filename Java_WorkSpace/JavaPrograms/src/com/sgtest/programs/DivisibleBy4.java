package com.sgtest.programs;

class Divisible
{
    Divisible()
    {
        int count=0;
        for(int i=50;i<=100;i++)
        {
                if((i%4)==0)
                {
                    count++;
                }
        }
        System.out.println(count);
    }
}
public class DivisibleBy4 {
    public static void main(String[] args) {
        Divisible obj1=new Divisible();
    }
}
