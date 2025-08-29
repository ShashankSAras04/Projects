package com.sgtest.programs;

public class ContinueDemo {
    public static void main(String[] args) {
        for(int i=61;i>=31;i--){
            if((i%2)==0){
                continue;
            }
            else{
                System.out.println(i);
            }
        }
    }

}
