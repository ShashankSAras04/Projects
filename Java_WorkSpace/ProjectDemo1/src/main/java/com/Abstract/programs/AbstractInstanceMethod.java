package com.Abstract.programs;

abstract class Country
{
    void Aisa(String cname)
    {
        System.out.println(cname);
    }
    void Europe(String cname1)
    {
        System.out.println(cname1);
    }
}
class CnamesDisplay extends Country
{
    
}

public class AbstractInstanceMethod{
    public static void main(String[] args) {
        CnamesDisplay ob = new CnamesDisplay();
        ob.Aisa("India");
        ob.Europe("Russia");
    }
}
