package com.sgtest.programs;


class Product{
    int ProdId;
    String ProdName;
    String VendorName;
    String ProdPrice;
}

class Customer{
    int CustId;
    String CustName;
    String CustProd;
    String CustMailID;
    String Phno;
}
class Purchase{
    int PurchaseId;
    String Purchased_Product;
    String CustName;
    String Address;
    String State;
}
public class ShoppingDetails {
    public static void main(String[] args) {
        Product obj1=new Product();
        obj1.ProdName="Lenovo Laptop";
        obj1.ProdId=0101;
        obj1.ProdPrice="52500 RS";
        obj1.VendorName="Lenovo Worlds";
        System.out.println("Product ID : "+obj1.ProdId);
        System.out.println("Product Name : "+obj1.ProdName);
        System.out.println("Product Price : "+obj1.ProdPrice);
        System.out.println("Product Vendor Name : "+obj1.VendorName);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");

        Customer obj2=new Customer();
        obj2.CustId=1001;
        obj2.CustName="Rajesh";
        obj2.CustProd="Lenovo Laptop";
        obj2.CustMailID="Raj@gamil.com";
        obj2.Phno="0987654341";
        System.out.println("Customer ID : "+obj2.CustId);
        System.out.println("Customer Name : "+obj2.CustName);
        System.out.println("Customer Product : "+obj2.CustProd);
        System.out.println("Customer MailID : "+obj2.CustMailID);
        System.out.println("Customer PhNo : "+obj2.Phno);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");

        Purchase obj3=new Purchase();
        obj3.PurchaseId=1102;
        obj3.Purchased_Product="Lenovo Laptop";
        obj3.CustName="Rajesh";
        obj3.Address="Vijayanagara, Bengaluru";
        obj3.State="Karanataka";
        System.out.println("Purchase ID : "+obj3.PurchaseId);
        System.out.println("Customer Name : "+obj3.CustName);
        System.out.println("Purchased Product : "+obj3.Purchased_Product);
        System.out.println("Customer Address : "+obj3.Address);
        System.out.println("Customer State : "+obj3.State);
    }
}
