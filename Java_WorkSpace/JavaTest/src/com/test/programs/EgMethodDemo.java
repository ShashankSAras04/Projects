package com.test.programs;

class MethodDemo
{
    void Display(int a[][],int b[][]) {
        int pg[][] = new int[a.length][a[0].length];
        for (int m = 0; m < a.length; m++) {
            for (int n = 0; n < b[m].length; n++) {
                pg[m][n] = a[m][n] + b[m][n];
            }
        }
        for (int u[] : pg) {
            for (int w : u) {
                System.out.print(w + " ");
            }
            System.out.println();
        }
        System.out.println("Transpose");
        int gp[][] = new int[a.length][a[0].length];
        for (int m = 0; m < pg.length; m++) {
            for (int n = 0; n < pg[m].length; n++) {
                gp[m][n] = pg[n][m];
            }
        }
        for (int u[] : gp) {
            for (int w : u) {
                System.out.print(w + " ");
            }
            System.out.println();
        }
        System.out.println("2nd column of the resultant Array");
        for(int m=0;m<a.length;m++)
        {
            System.out.println(pg[m][1]);
        }
        System.out.println("1st Row");
        for(int m=0;m<a.length;m++) {
            System.out.print(pg[0][m]+" ");
        }
        System.out.println();
        System.out.println("2nd Row");
        for(int m=0;m<a.length;m++) {
            System.out.print(pg[1][m]+" ");
        }
        System.out.println();
        System.out.println("Sum of Array");
        int sum=0;
        for (int m = 0; m < a.length; m++) {
            for (int n = 0; n < b[m].length; n++) {
                sum = sum + pg[m][n];
            }
        }
        System.out.println(sum);

        System.out.println("Diagonal Elements");
        for (int m = 0; m < a.length; m++) {
            for (int n = 0; n < b[m].length; n++) {
                if(m==n)
                {
                    System.out.println(pg[m][n]);
                }
            }
        }
        System.out.println("Subtract Elements by 2");
        int result=0;
        for (int m = 0; m < a.length; m++) {
            for (int n = 0; n < b[m].length; n++) {
                result=pg[m][n]-2;
                System.out.print(result+" ");
            }
            System.out.println();
        }
        System.out.println("Multiply by 3");
        result=0;
        for (int m = 0; m < a.length; m++) {
            for (int n = 0; n < b[m].length; n++) {
                result=pg[m][n]*3;
                System.out.print(result+" ");
            }
            System.out.println();
        }
        System.out.println("sum of 1st row elements and multiplied by sum of 2nd row");
        int sum1=0;
        int sum2=0;
        for(int m=0;m<a.length;m++)
        {
            sum1=sum1+pg[0][m];
            sum2=sum2+pg[1][m];
        }
        int result2=(sum1*sum2);
        System.out.println(result2);
    }
}
public class EgMethodDemo
{
    public static void main(String[] args)
    {
        MethodDemo obj1=new MethodDemo();
        int arr1[][]={{1,2},{3,4}};
        int arr2[][]={{5,6},{7,8}};
        obj1.Display(arr1,arr2);
    }
}
