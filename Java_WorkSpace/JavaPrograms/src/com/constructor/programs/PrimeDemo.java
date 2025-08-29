package com.constructor.programs;

public class PrimeDemo
{
    public static void main(String[] args) {
        int num=49;

        int primeNumber=0;
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                primeNumber++;
            }
        }
        if(primeNumber ==0)
        {
            System.out.println(num);
        }
        else
        {
            System.out.println(num);
        }
    }
}
