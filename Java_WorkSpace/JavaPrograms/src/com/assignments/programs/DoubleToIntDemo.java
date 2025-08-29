package com.assignments.programs;
class DoubleArrayDemo
{
    void Display(double a[])
    {
       int v[]=new int[a.length];
       int j=0;
        for(double i:a)
        {
            int var=(int) i;
            v[j]=var;
            j++;
        }
        for(int i:v)
        {
            System.out.println(i);
        }
    }
}
public class DoubleToIntDemo {
    public static void main(String[] args) {
        double p[]={10.2,2.2,20.3,33.3};
        DoubleArrayDemo obj1=new DoubleArrayDemo();
        obj1.Display(p);

    }

}
