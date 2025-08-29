package com.Demo;

class Const{
    Const(int[][] arr){
        if(arr.length==arr[0].length) {
            int[][] arr1 = new int[arr.length][arr[0].length];
            System.out.println("----------------------BEFORE TRANSPOSE---------------------");
            for (int k[] : arr) {
                for (int p : k) {
                    System.out.print(p + " ");
                }
                System.out.println();
            }
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr1[i][j] = arr[j][i];
                }
            }
            System.out.println("----------------------AFTER TRANSPOSE---------------------");
            for (int k[] : arr1) {
                for (int p : k) {
                    System.out.print(p + " ");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Cant to Transpose");
        }
    }
}
public class ConstTranspose {
    public static void main(String[] args) {
        int[][] ar={{1,2,3},{4,5,6},{7,8,9}};
        Const obj=new Const(ar);
    }
}
