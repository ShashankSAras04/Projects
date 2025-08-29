package com.Demo;

public class PythagoresDemo {
    public static void main(String[] args) {
        int side1=5;
        int side2=5;
        side1=(int)Math.pow(side1,2);
        side2=(int)Math.pow(side2,2);
        int result=(int)Math.sqrt(side1+side2);
        System.out.println(result);
    }
}
