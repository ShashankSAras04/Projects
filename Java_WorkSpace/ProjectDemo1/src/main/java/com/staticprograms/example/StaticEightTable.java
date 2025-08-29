package com.staticprograms.example;

class TableDemo
{
    static int[] Display(int num1)
    {
        int res[]=new int[10];
        int o=0;
        for(int i=1;i<=10;i++)
        {
            res[o]=num1*i;
            o++;
        }
        return res;
    }
}
public class StaticEightTable {
    public static void main(String[] args)
    {
        int res1[]= TableDemo.Display(8);
        for(int k:res1)
        {
            System.out.println(k);
        }
    }
}

