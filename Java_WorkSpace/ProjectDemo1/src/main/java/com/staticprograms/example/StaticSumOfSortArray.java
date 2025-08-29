package com.staticprograms.example;

class SumDemo
{
    static int Display(short a[])
    {
        int sum=0;
        for(short k:a)
        {
            sum=sum+k;
        }
        return sum;
    }
}
public class StaticSumOfSortArray  {
    public static void main(String[] args) {
        short[] arr={1,2,3,4};
        int val=SumDemo.Display(arr);
        System.out.println(val);
    }
}
