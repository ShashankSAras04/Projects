package com.Demo;

public class Transpose {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr1=new int[arr.length][arr[0].length];

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr1[i][j]=arr[j][i];
            }
        }
        for(int k[]:arr1)
        {
            for(int p:k)
            {
                System.out.print(p+" ");
            }
            System.out.println();
        }
    }
}
