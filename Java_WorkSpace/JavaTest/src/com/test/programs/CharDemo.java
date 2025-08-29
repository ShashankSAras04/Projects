package com.test.programs;

class CharDemo1
{
    void Display1(char ch[])
    {
        for(int i=0;i<ch.length/2;i++)
        {
            System.out.print(ch[i]+" ");
        }
    }
}
public class CharDemo {
    public static void main(String[] args) {
        char c[]={'a','b','c','d','e','f'};
        CharDemo1 obj1=new CharDemo1();
        obj1.Display1(c);
    }
}
