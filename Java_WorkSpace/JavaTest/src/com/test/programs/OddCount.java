package com.test.programs;

class CountDemo
{
    void Display(int i,int j)
    {
        int count=0;
        for(int p=i;p<=j;p++)
        {
            if(p%2==1)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
public class OddCount {
    public static void main(String[] args) {
        CountDemo obj1=new CountDemo();
        obj1.Display(1,1000);
    }
}
