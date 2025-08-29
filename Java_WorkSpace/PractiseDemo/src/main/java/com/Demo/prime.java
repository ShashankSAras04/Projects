package com.Demo;

public class prime {
    public static void main(String[] args) {
        int size=0;
        for(int i=2;i<=100;i++)
        {
            int primeno=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    primeno++;
                }
            }
            if(primeno==0)
            {
                size++;
            }
        }
        int[] arr1=new int[size];

        int k=0;
        for(int i=2;i<=100;i++)
        {
            int primeno=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    primeno++;
                    break;
                }
            }

            if(primeno==0)
            {
                arr1[k]=i;
                k++;
            }
        }
        for(int arr:arr1)
        {
            System.out.println(arr);
        }
    }
}
