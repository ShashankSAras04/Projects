package com.sgtest.programs;

public class OneArray {
    public static void main(String[] args) {
        int a[]={10,20,30};
        int count=0;
        for(int kk:a){
            count=count+kk;
        }
        System.out.println("Sum of Array "+count);
    }
}
