package com.assignments.programs;

class ConcatinateDemo
{
    void CharDemo(char ch[])
    {
        String sum="";
        for(int i=0;i<ch.length;i++)
        {
            sum=sum+ch[i];
        }
        System.out.println(sum);
    }
}
public class CharConcatinate {
    public static void main(String[] args) {
        char ch1[]={'a','b','c','d','e','f'};
        ConcatinateDemo obj1=new ConcatinateDemo();
        obj1.CharDemo(ch1);
    }
}
