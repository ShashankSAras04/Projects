package com.paraconst.programs;

class InvoiceDetails
{
    InvoiceDetails(int id)
    {
        System.out.println("Invoice Id : "+id);
    }
    InvoiceDetails(String name)
    {
        System.out.println("invoice Name :"+name);
    }
    InvoiceDetails(String name,String ProdName)
    {
        System.out.println("invoice Name :"+name);
        System.out.println("Product Name :"+ProdName);
    }
    InvoiceDetails(int id,String name,String Prodname,String Address)
    {
        System.out.println("Invoice Id : "+id);
        System.out.println("Invoice Name : "+name);
        System.out.println("Product Name : "+Prodname);
        System.out.println("Invoice Address : "+Address);
    }

}
public class Invoice {
    public static void main(String[] args) {
        InvoiceDetails obj1=new InvoiceDetails(11);
        InvoiceDetails obj2=new InvoiceDetails("Raju");
        InvoiceDetails obj3=new InvoiceDetails("Sreeni","Laptop");
        InvoiceDetails obj4=new InvoiceDetails(230,"sunil","Lenovo Laptop","Banglore");
    }
}
