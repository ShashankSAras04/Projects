package com.assignments.programs;

class SortDemo1
{
    int[] Display(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
        return arr;
    }
}
public class UnsortedToSort {
    public static void main(String[] args) {
        SortDemo1 obj1=new SortDemo1();
        int[] a={9,8,7,6,5};
        int[] c=obj1.Display(a);
        for(int k:c)
        {
            System.out.println(k);
        }
    }
}
