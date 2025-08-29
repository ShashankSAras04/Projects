package com.gentech.Practice;

public class rever {
    public static void main(String[] args) {
        int num=123;
        int rev=0;
        while(num>0)
        {
            int rem=num%10;
            rev=rev+rem;
            num=num/10;
        }
        System.out.println(rev);
    }
}
