package com.paraconst.programs;

class ContractDetails
{
    ContractDetails(int id)
    {
        System.out.println("Contract Id : "+id);
    }
    ContractDetails(String name)
    {
        System.out.println("Contract Name :"+name);
    }
    ContractDetails(int id,String name,String Conname,String Address)
    {
        System.out.println("Contract Id : "+id);
        System.out.println("Contract Name : "+name);
        System.out.println("Contract taken by : "+Conname);
        System.out.println("Contract Office Address : "+Address);
    }

}
public class Contract {
    public static void main(String[] args) {
        ContractDetails obj1=new ContractDetails(1100);
        ContractDetails obj2=new ContractDetails("Bridge Construction");
        ContractDetails obj4=new ContractDetails(2330,"sunil","School Constructing","Banglore");
    }
}
