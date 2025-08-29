package com.test.programs;

import java.lang.reflect.Array;

class ArrayDemo
{
    void Display(int a[])
    {
        int sub=0;
        for(int i=0;i<a.length;i++)
        {
            sub=a[i]-3;
            System.out.print(sub+" ");
        }
    }
}
public class ArraySub {
    public static void main(String[] args) {
        int arr1[]={10,9,8,7};
        ArrayDemo obj1=new ArrayDemo();
        obj1.Display(arr1);
    }
}
