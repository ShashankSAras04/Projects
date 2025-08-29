package com.paraconst.programs;

class TableDemo
{
    int result=0;
    TableDemo()
    {
        int a=10;
        for(int i=1;i<=10;i++)
        {
            result = a*i;
            System.out.println(a+" * "+i+" = "+result);
        }
    }

}
public class CorresTable {
    public static void main(String[] args) {
        TableDemo obj1=new TableDemo();
    }
}
