package com.assignments.programs;

class SumDemo
{
    int Display(short a[])
    {
        int sum=0;
        for(short k:a)
        {
            sum=sum+k;
        }
        return sum;
    }
}
public class SumOfSorrtArray {
    public static void main(String[] args) {
        SumDemo obj1=new SumDemo();
        short[] arr={1,2,3,4};
        int val=obj1.Display(arr);
        System.out.println(val);
    }
}
