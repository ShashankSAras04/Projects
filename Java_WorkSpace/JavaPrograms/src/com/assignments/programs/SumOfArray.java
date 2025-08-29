package com.assignments.programs;

class ArraySum
{
    int[] Display(int a[],int b[])
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
public class SumOfArray {
    public static void main(String[] args) {
        ArraySum obj1 = new ArraySum();
        int a[] = {1, 2, 3, 4, 5, 6};
        int b[] = {7, 8, 9};
        int[] s = obj1.Display(a, b);
        for (int o : s) {
            System.out.println(o);
        }
    }
}
