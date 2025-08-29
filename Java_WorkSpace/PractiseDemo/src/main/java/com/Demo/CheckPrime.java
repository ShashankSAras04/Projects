package com.Demo;

public class CheckPrime
{
    boolean isprime(int num){
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        CheckPrime obj=new CheckPrime();
        boolean res=obj.isprime(10);
        System.out.println(res);
    }
}
