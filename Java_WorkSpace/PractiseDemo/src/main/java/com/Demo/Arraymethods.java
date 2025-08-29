package com.Demo;

import java.util.Arrays;

public class Arraymethods {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,2,3,1,6,9};
        Arrays.sort(arr);
        for(int n:arr)
        {
            System.out.print(n +" ");
        }
        System.out.println();
        System.out.println(Arrays.binarySearch(arr,1));
        System.out.println(Arrays.toString(arr));
        System.out.println();
        int[] copy=Arrays.copyOf(arr,4);
        for(int n:copy)
        {
            System.out.print(n+" ");
        }
        System.out.println();
        System.out.println(Arrays.equals(arr,copy));
        int[] arr1=new int[3];
        Arrays.fill(arr1,2);
        for(int n:arr1)
        {
            System.out.println(n);
        }
    }
}
