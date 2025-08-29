package com.Demo;

public class ReversNum {
    public static void main(String[] args) {
        int num=123;
        int reversNum=0;
        //int rem=0;

        while(num>0){
            int digit = num % 10;
            //System.out.println(digit);
            reversNum = reversNum * 10 + digit;
            //System.out.println(reversNum);
            num =num/ 10;
            System.out.println(num);
        }
        System.out.println(reversNum);
    }
}
