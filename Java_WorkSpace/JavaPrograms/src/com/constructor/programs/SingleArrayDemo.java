package com.constructor.programs;

class ArrayDemo
{
    int a[];
    ArrayDemo(int b[])
    {
        a=b;
        for(int i=0;i<a.length;i++)
        {
            if(i==0 || i==a.length-1)
            {
                System.out.println(a[i]);
            }
        }
    }

}
public class SingleArrayDemo {
    public static void main(String[] args) {
        int array[]={1,2,3};
        ArrayDemo obj1=new ArrayDemo(array);
    }
}
