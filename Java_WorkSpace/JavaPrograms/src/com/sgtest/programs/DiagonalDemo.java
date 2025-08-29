package com.sgtest.programs;

public class DiagonalDemo {
        public static void main(String[] args) {
            String a[][]={{"Hi","Hello","Morning"},{"SGTEST","Institue","Banglore"},{"Tumkur","Mysore","Banglore"}};
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[i].length;j++){
                    if(i==j) {
                        System.out.println(a[i][j]);
                    }
                }
            }
        }
    }
