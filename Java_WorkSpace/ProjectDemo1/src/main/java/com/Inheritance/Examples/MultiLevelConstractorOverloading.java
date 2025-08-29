package com.Inheritance.Examples;

class Vehicle
{
    Vehicle(int id)
    {
        System.out.println("Vehicle Id "+id);
    }
    Vehicle(String name)
    {
        System.out.println("vehicle Name "+name);
    }
}
class State extends Vehicle
{
   State(int vid,String statename)
   {
       super(vid);
       System.out.println("State Name : "+statename);
   }
   State(String name)
   {
       super(name);
   }
}
class Country extends State
{
    Country(String countryname, int id,String statename)
    {
        super(id,statename);
        System.out.println("Country Name "+countryname);
    }
    Country(String name,int cid)
    {
        super(name);
        System.out.println("Disitrict code "+cid);
    }
}


public class MultiLevelConstractorOverloading {
    public static void main(String[] args) {
        Country ob=new Country("India",10,"Karanataka");
        Country ob1=new Country("Suzuki",64);

    }
}
