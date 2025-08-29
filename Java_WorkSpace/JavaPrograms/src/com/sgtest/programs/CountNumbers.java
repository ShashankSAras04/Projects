package com.sgtest.programs;

import java.sql.SQLOutput;

public class CountNumbers {
    public static void main(String[] args) {
        int count=0;
        for(int i=100;i<=500;i++){
            if((i%3)==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
