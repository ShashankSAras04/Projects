package com.paraconst.programs;

class Product{
    int ProdId;
    String ProdName;
    String VendorName;
    String ProdPrice;
    Product(String name,int id,String price,String vendor){
        ProdName=name;
        ProdId=id;
        ProdPrice=price;
        VendorName=vendor;
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
    Customer(int id,String name,String prod,String mail,String ph){
        CustId=id;
        CustName=name;
        CustProd=prod;
        CustMailID=mail;
        Phno=ph;
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
    Purchase(int id,String product,String cust,String address,String state){
        PurchaseId=id;
        Purchased_Product=product;
        CustName=cust;
        Address=address;
        State=state;
        System.out.println("Purchase ID : "+PurchaseId);
        System.out.println("Customer Name : "+CustName);
        System.out.println("Purchased Product : "+Purchased_Product);
        System.out.println("Customer Address : "+Address);
        System.out.println("Customer State : "+State);
    }
}
public class ShoppingDemo {
    public static void main(String[] args) {
        Product obj1=new Product("Lenovo Laptop",1120,"39999 Rs","Chopdha IT Solutions");
        Customer obj2=new Customer(234,"Jimpa","Lenovo Laptop","jimpa@gmail.com","9087654562");
        Purchase obj3=new Purchase(9900,"Lenovo Laptop","Jimpa","Vijayanagara","Karantaka");
    }
}
