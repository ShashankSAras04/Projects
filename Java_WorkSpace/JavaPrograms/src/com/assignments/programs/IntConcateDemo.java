package com.assignments.programs;

class Demo1
{
    void Display(int s[][])
    {
        int arr1[]=new int[s.length];
        int p=0;
        for(int i=0;i<s.length;i++)
        {
            int sum=0;
            for(int j=0;j<s[i].length;j++)
            {
                sum=sum+(s[i][j]);
            }

            arr1[p]=sum;
            p++;
        }
        for(int i=arr1.length-1;i>=0;i--)
        {
            System.out.println(arr1[i]);
        }
    }
}
public class IntConcateDemo
{
    public static void main(String[] args)
    {
        int ss[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        Demo1 obj1=new Demo1();
        obj1.Display(ss);
    }
}
