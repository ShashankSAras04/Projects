package com.Demo;

public class AddTwoDArray {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},
                {4,5,6},
                {7,8,9}};
        int result=0;
        for (int k[]:arr)
        {
            for(int p:k)
            {
                result = result+p;
            }
        }
        System.out.println(result);
    }
}
