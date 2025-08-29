package com.test.programs;

class TabelDemo
{
    void Dissplay(int i)
    {
        for(int j=i;j<=20;j++)
        {
            int result=0;
            for(int p=1;p<=10;p++)
            {
                result=j*p;

                System.out.println(j+"*"+p+"= "+result);
            }
        }
    }
}
public class MathTable {
    public static void main(String[] args) {
        TabelDemo obj1=new TabelDemo();
        obj1.Dissplay(1);
    }
}
