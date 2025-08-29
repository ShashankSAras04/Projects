package com.staticprograms.example;

class TwoDArrayDemo {
    static int[] Diplsay(int arr[][])
    {
        int c[]=new int[arr[0].length];
        for(int i=0;i<arr[0].length;i++)
        {
            c[i]=arr[0][i];
        }
        return c;
    }

}

public class StaticArrayDemo1 {
    public static void main(String[] args)
    {
        int a[][]={
        {10,20,30},
        {40,50,60}};
        int d[]= TwoDArrayDemo.Diplsay(a);
        for(int k:d)
        {
            System.out.print(k+" ");
        }
    }
}
