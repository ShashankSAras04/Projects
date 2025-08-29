package com.test.programs;

class ArrayDemo1
{
    void Display(int a[][],int b[][])
    {
        int sum=0;

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                sum=sum+b[i][j]+a[i][j];
            }
        }
        System.out.println(sum);
    }
}
public class AddArrayDemo {
    public static void main(String[] args) {
        int arr1[][]={{1,2},{2,4}};
        int arr2[][]={{3,6},{6,8}};
        ArrayDemo1 obj1=new ArrayDemo1();
        obj1.Display(arr1,arr2);

    }
}
