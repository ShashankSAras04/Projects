package com.paraconst.programs;

class PurchaseDetailsdemo
{
    PurchaseDetailsdemo(int id)
    {
        this("Rajesh");
        System.out.println("Purchase ID : "+id);
    }
    PurchaseDetailsdemo(String name)
    {
        this("Raj","Banglore");
        System.out.println("Purchase by : "+name);
    }
    PurchaseDetailsdemo(String name,String address)
    {
        System.out.println("Name : "+name);
        System.out.println("Address : "+address);
    }


}
public class PurchaseDemo {
    public static void main(String[] args) {
        PurchaseDetailsdemo obj1=new PurchaseDetailsdemo(100);
    }
}
