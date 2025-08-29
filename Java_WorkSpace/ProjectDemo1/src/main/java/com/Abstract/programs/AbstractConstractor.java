package com.Abstract.programs;
abstract class Addition {
    Addition(int i, int j)
    {
        int result = i + j;
        System.out.println(result);
    }
}
class Display extends Addition
{
    Display(int a,int b)
    {
        super(a,b);
    }

}

public class AbstractConstractor {
    public static void main(String[] args) {
        Display ob=new Display(10,20);

    }
}
