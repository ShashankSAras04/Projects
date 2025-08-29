package com.paraconst.programs;

class Tables
{
    Tables()
    {
        int result=0;
        for(int i=1;i<=20;i++)
        {
            for (int j=1;j<=10;j++)
            {
                result=i*j;
                System.out.println(i+" * "+j+" = "+result);
            }
            System.out.println();
        }
    }
}
public class TablesDemo {
    public static void main(String[] args)
    {
        Tables obj1=new Tables();
    }
}
