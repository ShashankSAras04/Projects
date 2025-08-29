package com.sgtest.programs;

public class DoubleArrayDemo {
    public static void main(String[] args) {
        double a[][]={{10.1,20.1,30.3},{40.4,50.5,60.6},{70.8,80.8,90.0}};
        double sum=0.0;
        for(int i=a.length-1;i<a.length;i++){
            for(int j=0;j<a[i].length;j++) {
                sum = sum + a[i][j];
            }
            }
        System.out.println(sum);
        }
    }
