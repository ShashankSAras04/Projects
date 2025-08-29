package com.gentech.Practice;

public class bubblesort {
    public static void main(String[] args) {
        int arr[]={1,8,54,8,4,99,5};

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int n:arr)
        {
            System.out.println(n);
        }
    }
}
