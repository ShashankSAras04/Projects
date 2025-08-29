package com.assignments.programs;

class ConcateDemo
{
    void Display(char s[][])
    {
        String arr1[]=new String[s.length];
        int p=0;
        for(int i=0;i<s.length;i++)
        {
            String sum="";
            for(int j=0;j<s[i].length;j++)
            {
                sum=sum+s[i][j];
            }
            arr1[p]=sum;
            p++;
        }
        for(String k:arr1)
        {
            System.out.println(k);
        }
    }
}
public class ConcateRowDemo
{
    public static void main(String[] args)
    {
        char ss[][]={
                {'A','B','C'},
                {'e','f','g'},
                {'h','i','j'} };
        ConcateDemo obj1=new ConcateDemo();
        obj1.Display(ss);
    }
}
