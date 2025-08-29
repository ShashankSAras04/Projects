package com.assignments.programs;

class StringDemo1
{
    void Display(String a[])
    {
        String sum="";
        for(int i=a.length-1;i>0;i--)
        {
            sum=sum+a[i]+",";
        }
        System.out.println(sum);
    }
}
public class StringConcateDemo
{
    public static void main(String[] args)
    {
        String s[]={"First","to","Last","to","back","Going"};
        StringDemo1 obj1=new StringDemo1();
        obj1.Display(s);
    }
}
