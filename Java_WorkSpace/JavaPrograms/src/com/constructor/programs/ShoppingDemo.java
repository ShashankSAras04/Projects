package com.constructor.programs;

class Product{
    int ProdId;
    String ProdName;
    String VendorName;
    String ProdPrice;
    Product(){
        ProdName="Lenovo Laptop";
        ProdId=0101;
        ProdPrice="52500 RS";
        VendorName="Lenovo Worlds";
        System.out.println("Product ID : "+ProdId);
        System.out.println("Product Name : "+ProdName);
        System.out.println("Product Price : "+ProdPrice);
        System.out.println("Product Vendor Name : "+VendorName);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
    }
}

class Customer{
    int CustId;
    String CustName;
    String CustProd;
    String CustMailID;
    String Phno;
    Customer(){
        CustId=1001;
        CustName="Rajesh";
        CustProd="Lenovo Laptop";
        CustMailID="Raj@gamil.com";
        Phno="0987654341";
        System.out.println("Customer ID : "+CustId);
        System.out.println("Customer Name : "+CustName);
        System.out.println("Customer Product : "+CustProd);
        System.out.println("Customer MailID : "+CustMailID);
        System.out.println("Customer PhNo : "+Phno);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
    }
}
class Purchase{
    int PurchaseId;
    String Purchased_Product;
    String CustName;
    String Address;
    String State;
    Purchase(){
        PurchaseId=1102;
        Purchased_Product="Lenovo Laptop";
        CustName="Rajesh";
        Address="Vijayanagara, Bengaluru";
        State="Karanataka";
        System.out.println("Purchase ID : "+PurchaseId);
        System.out.println("Customer Name : "+CustName);
        System.out.println("Purchased Product : "+Purchased_Product);
        System.out.println("Customer Address : "+Address);
        System.out.println("Customer State : "+State);
    }
}
public class ShoppingDemo {
    public static void main(String[] args) {
        Product obj1=new Product();
        Customer obj2=new Customer();
        Purchase obj3=new Purchase();
    }
}
