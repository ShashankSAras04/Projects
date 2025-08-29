package com.Demo;

import java.io.PrintStream;

public class Findlength {
    public static void main(String[] args) {
        int row=0;
        int col=0;
        int i=0;
        int[][] arr={{1,2,3,4,5},{2,3,4,5,6}};
        String str="asdfghjklwertyuiop";
        try{
            while(true)
            {
                char temp = str.charAt(i);
                i++;
            }
        }catch (Exception e)
        {
            System.out.println("string counted");
        }
        try{
            while(true)
            {
                int temp = arr[row][0];
                row++;
            }
        }catch (Exception e)
        {
            System.out.println("row counted");
        }
        try{
            while(true)
            {
                int temp = arr[0][col];
                col++;
            }
        }catch (Exception e)
        {
            System.out.println("col counted");
        }
        finally {
            System.out.println("rows "+row+" "+" cols " +col+" string count "+i);
        }

    }
}
