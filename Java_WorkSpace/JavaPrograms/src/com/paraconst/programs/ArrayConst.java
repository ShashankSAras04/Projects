package com.paraconst.programs;

class ArrayDemo
{
    int a[][];
    ArrayDemo(int b[][])
    {
        a=b;
        for(int i=1;i<a.length-1;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
public class ArrayConst {
    public static void main(String[] args) {
        int array[][]={{1,2,3},{4,5,6},{7,8,9}};
        ArrayDemo obj1=new ArrayDemo(array);
    }
}
