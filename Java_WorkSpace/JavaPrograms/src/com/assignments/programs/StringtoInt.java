package com.assignments.programs;
class StringDemo
{
    void Display(String a[])
    {
        int v[]=new int[a.length];
        int j=0;
        for(String k:a)
        {
            v[j]=Integer.parseInt(k);
            j++;
        }
        int sum=0;
        for(int k:v)
        {
            sum=sum+k;
        }
        System.out.println(sum);
    }
}
public class StringtoInt {
    public static void main(String[] args) {
        String o[]={"1","2","3","4","5"};
        StringDemo obj1=new StringDemo();
        obj1.Display(o);
    }
}
