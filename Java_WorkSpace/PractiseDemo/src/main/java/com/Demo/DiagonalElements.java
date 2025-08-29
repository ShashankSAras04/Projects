package com.Demo;

public class DiagonalElements {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},
                {4,5,6},
                {7,8,9}};
        int[][] b=new int[arr.length][arr[0].length];
        //char c='#';
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    b[i][j] = arr[i][j];
                } else {
                    b[i][j] = (int) '#';
                }
            }
        }

        for(int i=0;i<b.length;i++) {
            for (int j = 0; j < b[i].length; j++) {
                if (i == j) {
                    System.out.print(b[i][j] +" ");
                } else {
                    System.out.print((char)b[i][j] +" ");
                }
            }
            System.out.println();
        }

        }
    }

