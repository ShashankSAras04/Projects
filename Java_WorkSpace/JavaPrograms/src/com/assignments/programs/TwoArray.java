package com.assignments.programs;

class AddArray
{
    void ResultArray(int a[],int b[])
    {
        int size=(a.length+b.length);
        int c[]=new int[size];
        int k=0;
        for(int i=0;i<a.length;i++)
        {
            c[k]=a[i];
            k++;
        }
        int l=a.length;
        for(int j=0;j<b.length;j++)
        {
            c[l]=b[j];
            l++;
        }
        for(int o:c)
        {
            System.out.print(o+" ");
        }
    }
}
public class TwoArray {
    public static void main(String[] args)
    {
        int arr1[]={1,2,3};
        int arr2[]={4,5,6,7};
        AddArray obj1=new AddArray();
        obj1.ResultArray(arr1,arr2);
    }
}
