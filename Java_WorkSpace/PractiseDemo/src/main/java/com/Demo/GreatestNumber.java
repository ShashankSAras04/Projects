package com.Demo;

public class GreatestNumber {
    int chechGreat(int num1,int num2)
    {
        if(num1>num2)
        {
            return num1;
        }
        return num2;
    }

    public static void main(String[] args) {
        GreatestNumber ob=new GreatestNumber();
        int res=ob.chechGreat(10,20);
        System.out.println("Greatest Number"+res);
    }
}
