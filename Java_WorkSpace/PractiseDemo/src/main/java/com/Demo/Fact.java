package com.Demo;

public class Fact {
    int GetFact(int num)
    {
        int res=1;
        for(int i=num;i>=1;i--)
        {
            res= res*i;
        }
        return res;
    }

    public static void main(String[] args) {
        Fact obj=new Fact();
        int output=obj.GetFact(5);
        System.out.println(output);
    }
}
