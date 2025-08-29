package com.sgtest.programs;

public class ThreeArrayDemo {
    public static void main(String[] args) {
        char a[][]={{'a','b','c'},{'e','f','g'},{'h','i','j'}};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(j%2==1) {
                    System.out.println(a[i][j]);
                }
            }
        }
    }
}
