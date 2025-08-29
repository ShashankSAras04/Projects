package com.Demo;

public class PrimeOrNot {
    static void checkPrime(int num)
    {
        int flag=0;
        for(int i=2;i<num-1;i++)
        {
            if(num%i==0)
            {
                flag++;
                break;
            }
        }
        if(flag == 0)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("Not prime");
        }
    }
    public static void main(String[] args) {
        PrimeOrNot.checkPrime(7);

    }
}
