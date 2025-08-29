package com.assignments.programs;

class OddDemo
{
    int[] Display(int num1,int num2)
    {
        int size=0;
        for(int i=num1;i>=num2;i--)
        {
            if((i%2)==1)
            {
                size++;
            }
        }
        int[] c=new int[size];
        int j=0;
        for (int i = num1; i >= num2; i--)
        {
            if (i % 2 == 1)
            {
                c[j] = i;
                j++;
            }
        }
        return c;
    }
}
public class OddNumbers{
    public static void main(String[] args) {
        OddDemo obj1=new OddDemo();
        int a[]=obj1.Display(91,71);
        for(int k:a)
        {
            System.out.println(k);
        }
    }
}
