package com.gentech;

class P1{
    public static void main(String args[])
    {
        Outer ob=new Outer();
        Outer.Inner obj = ob.new Inner();

        ob.out();
        obj.in();


    }
}
class Outer
{
    void out()
    {
        System.out.println("100");
    }
    //Inner in=new Inner();
    class Inner{
        void in()
        {
            System.out.println("10");
            out();
        }
    }
}
