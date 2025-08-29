package com.Demo;

public class LargestNumber {
    public static void main(String[] args) {
        int arr[]={1,6,34,63,32,76,8,1,9};
        int max=0;
        int secondmax=0;
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i] > max)
            {
                secondmax=max;
                max=arr[i];

            }

        }
        System.out.println(max);
        System.out.println(secondmax);
    }
}
