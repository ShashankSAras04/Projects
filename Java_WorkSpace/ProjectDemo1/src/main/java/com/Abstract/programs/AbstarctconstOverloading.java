package com.Abstract.programs;

abstract class Laptops
{
    Laptops(String lapname1)
    {
        System.out.println("Laptop name "+lapname1);
    }
    Laptops(int price)
    {
        System.out.println("Laptop Price "+price);
    }
}
class Details extends Laptops
{
    Details(String name1)
    {
        super(name1);
    }
    Details(int amount)
    {
        super(amount);
    }
}
public class AbstarctconstOverloading {
    public static void main(String[] args) {
        Details ob=new Details("Lenovo");
        Details ob1=new Details(53000);
    }
}
