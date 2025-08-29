package com.Demo;

public class ChangeArray {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},
                {4,5,6},
                {7,8,9}};
        for(int i=0;i<arr[0].length;i++)
        {
            int temp=arr[0][i];
            arr[0][i]=arr[1][i];
            arr[1][i]=temp;

        }
        for(int k[]:arr)
        {
            for(int p:k)
            {
                System.out.print(p+" ");
            }
            System.out.println();
        }
    }
}
