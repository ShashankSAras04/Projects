package com.paraconst.programs;
class Arrayeg
{
    void Arraysum(int a[],int b[])
    {
        int c[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            c[i]=a[i]+b[i];
        }
        for(int i=(c.length/2);i<c.length;i++)
        {
            System.out.println(c[i]);
        }
    }
}
public class ArraySum {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4};
        int arr2[]={4,5,6,8};
        Arrayeg obj1=new Arrayeg();
        obj1.Arraysum(arr1,arr2);
    }
}
