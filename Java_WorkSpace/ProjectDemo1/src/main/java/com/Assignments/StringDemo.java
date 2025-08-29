package com.Assignments;

public class StringDemo {
    public static void main(String[] args) {
        String name="Banglore and Mysore";
        System.out.println(name);
        String splited[]= name.split(" ");
        String result="";
        for(int i=splited.length-1;i>=0;i--)
        {
            result=result+splited[i]+" ";
        }
        System.out.println(result);
    }
}
