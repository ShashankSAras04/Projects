package com.Inheritance.Examples;
 class Person
 {
     void personId(int pid)
     {
        System.out.println("Person ID : "+pid);
     }
 }
class PersonFname extends Person
{
    void personDisplay(String name)
    {
        System.out.println("Person Name : "+name);
    }
}
class PersonMail extends Person
{
    void personDisplay(String mailid)
    {
        System.out.println("Person Name : "+mailid);
    }
}
public class HirerarcicalDemo {
    public static void main(String[] args) {
        PersonMail o=new PersonMail();
        o.personDisplay("richmonds@gmail.com");
        o.personId(100);
        PersonFname o1=new PersonFname();
        o1.personDisplay("ramesh@gmail.com");
        o1.personId(10020);
    }
}
