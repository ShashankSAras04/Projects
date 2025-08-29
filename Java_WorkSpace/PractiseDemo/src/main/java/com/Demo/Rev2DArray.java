package com.Demo;

public class Rev2DArray {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},
                {4,5,6},
                {7,8,9}};
        int[][] b=new int[arr.length][arr[0].length];
        int c=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            int r=0;
            for(int j=arr.length-1;j>=0;j--)
            {

                b[c][r]=arr[i][j];
                r++;
            }
            c++;
            //System.out.println();
        }

        for(int k[]:b)
        {
            for(int p:k)
            {
                System.out.print(p+" ");
            }
            System.out.println();
        }
    }
}
