package com.staticprograms.example;

class ArraySum
{
    static int[] Display(int a[],int b[])
    {
        int[] c=new int[a.length+b.length];
        for(int i=0;i<a.length;i++)
        {
            c[i]=a[i];
        }
        int u=a.length;
        for(int i=0;i<b.length;i++)
        {
            c[u]=b[i];
            u++;
        }
        return c;
    }
}
public class StaticSumOfArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6};
        int b[] = {7, 8, 9};
        int[] s = ArraySum.Display(a, b);
        for (int o : s) {
            System.out.println(o);
        }
    }
}