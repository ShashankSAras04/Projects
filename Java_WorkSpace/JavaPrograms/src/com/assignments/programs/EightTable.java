package com.assignments.programs;

class TableDemo
{
    int[] Display(int num1,int num2)
    {
        int res[]=new int[10];
        int o=0;
        for(int i=num1;i<=num2;i++)
        {
            res[o]=8*i;
            o++;
        }
        return res;
    }
}
public class EightTable {
    public static void main(String[] args) {
        TableDemo ob=new TableDemo();
        int res1[]= ob.Display(1,10);
        for(int k:res1)
        {
            System.out.println(k);
        }
    }
}
