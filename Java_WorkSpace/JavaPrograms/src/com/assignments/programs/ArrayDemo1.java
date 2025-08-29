package com.assignments.programs;

class TwoDArrayDemo {
    int[] Diplsay(int arr[][])
    {
        int c[]=new int[arr[0].length];
        for(int i=0;i<arr[0].length;i++)
        {
            c[i]=arr[0][i];
        }
        return c;
    }

}

public class ArrayDemo1 {
    public static void main(String[] args) {
        TwoDArrayDemo obj1=new TwoDArrayDemo();
        int a[][]={
                {10,20,30},
                {40,50,60}};
        int d[]= obj1.Diplsay(a);
        for(int k:d)
        {
            System.out.print(k+" ");
        }
    }
}
