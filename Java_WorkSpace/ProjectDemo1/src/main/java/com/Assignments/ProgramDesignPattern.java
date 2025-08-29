package com.Assignments;

public class ProgramDesignPattern {
    public static void main(String[] args) {
        String name="PROGRAMMING";
       for(int i=0;i<=name.length();i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(name.charAt(j)+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=name.length()-1;i>=0;i--)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(name.charAt(j)+" ");
            }
            System.out.println();
        }
    }

}
