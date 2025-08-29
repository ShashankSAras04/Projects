package com.sgtest.programs;

public class ByteArray {
    public static void main(String[] args) {
        byte a[]={1,2,3,4,5,6,7,8,9,10};
        for(int i=((a.length/2));i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
