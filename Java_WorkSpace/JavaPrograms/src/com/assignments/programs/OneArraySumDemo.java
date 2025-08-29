package com.assignments.programs;

class SumArrayDemo
{
    void SumArray(double b[])
    {
        double sum=0;
        for(int i=(b.length/2);i<b.length;i++)
        {
            sum=sum+b[i];
        }
        System.out.println(sum);
    }
}
public class OneArraySumDemo {
    public static void main(String[] args) {
        double a[]={12.2,13.3,14.4,15.5};
        SumArrayDemo obj1=new SumArrayDemo();
        obj1.SumArray(a);

    }
}
