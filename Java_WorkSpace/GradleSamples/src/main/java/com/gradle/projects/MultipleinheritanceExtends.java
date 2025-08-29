package com.gradle.projects;

interface solid
{
    void solidname(String sname);
}
interface liquid
{
    void liqiuidname(String lname);
}
interface gas
{
    void gasname(String gname);
}

interface states extends solid,liquid,gas
{

}
class Physics implements states
{
    public void solidname(String sname)
    {
        System.out.println("Solid name "+sname);
    }
    public void liqiuidname(String lname)
    {
        System.out.println("Liquid name "+lname);
    }
    public void gasname(String gname)
    {
        System.out.println("Gas name "+gname);
    }
}

public class MultipleinheritanceExtends
{
    public static void main(String[] args) {
        Physics ob=new Physics();
        ob.solidname("Rock");
        ob.liqiuidname("Water");
        ob.gasname("Oxygen");
    }
}
