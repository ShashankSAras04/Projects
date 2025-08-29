package com.test.programs;

class PrimeDemo
{
    void Display(int i,int j)
    {
        for(int q=i;q<=j;q++)
        {
            int flag=0;
            for(int p=2;p<q;p++)
            {
                if(q%p==0)
                {
                    flag++;
                }
            }
            if(flag ==0)
            {
                System.out.println(q);
            }
        }
    }
}

public class PrimeNum {
    public static void main(String[] args) {
        PrimeDemo obj1=new PrimeDemo();
        obj1.Display(50,100);
    }
}
