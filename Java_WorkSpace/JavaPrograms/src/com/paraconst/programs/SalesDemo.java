package com.paraconst.programs;

class Sales
{
    Sales(int id)
    {
        this(100,"Shashank");
        System.out.println("Sales Id: "+id);
    }
    Sales(int id,String name)
    {
        this("Reroot Sales");
        System.out.println("Sales id: "+id);
        System.out.println("Saled by: "+name);
    }
    Sales(String name)
    {
        System.out.println("Sales Company: "+name);
    }
}
public class SalesDemo {
    public static void main(String[] args) {
        Sales obj1=new Sales(111);
    }
}
