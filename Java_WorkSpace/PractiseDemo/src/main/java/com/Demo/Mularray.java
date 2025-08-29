package com.Demo;

public class Mularray {
    public static void main(String[] args) {
        int[][] arr1={
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        int[][] arr2={
                {3,2,1},
                {9,5,3},
                {7,6,9}};
        int[][] arr3=new int[arr1.length][arr2[0].length];
        if(arr1[0].length==arr2.length)
        {
            for(int i=0;i<arr1.length;i++)
            {
                for(int j=0;j<arr2[0].length;j++)
                {
                    int sum=0;
                    for(int k=0;k<arr2.length;k++)
                    {
                        sum=sum+arr1[i][j]*arr2[k][j];
                    }
                    arr3[i][j]=sum;
                }
            }
        }
        else {
            System.out.println("not possible");
        }

        for(int a[]:arr3)
        {
            for(int b:a)
            {
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}
