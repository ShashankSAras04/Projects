package com.Demo;

public class Add2DArray {
    static int[][] getArray(int[][] arr1,int[][] arr2)
    {
        if(arr1.length==arr2.length && arr1[0].length==arr2[0].length)
        {
            int[][] res = new int[arr1.length][arr1[0].length];
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1.length; j++) {
                    res[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
            return res;
        }
        return null;
    }

    public static void main(String[] args) {
        int[][] a1={{1,2,3},
                {4,5,6},
                {7,8,9}};
        int[][] a2={{9,8,7},
                {6,5,4}};
        int[][] array=Add2DArray.getArray(a1,a2);
        if(array != null)
        {
            for (int i[] : array)
            {
                for (int j : i)
                 {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Not possible");
        }
    }
}
