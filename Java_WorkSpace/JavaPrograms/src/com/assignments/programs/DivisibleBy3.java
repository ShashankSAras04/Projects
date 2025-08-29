package com.assignments.programs;

class DivideDemo
{
    int[] Display(int num1,int num2)
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
public class DivisibleBy3 {
    public static void main(String[] args) {
        DivideDemo obj1=new DivideDemo();
        int d[]=obj1.Display(70,90);
        for(int k:d)
        {
            System.out.println(k);
        }
    }
}
