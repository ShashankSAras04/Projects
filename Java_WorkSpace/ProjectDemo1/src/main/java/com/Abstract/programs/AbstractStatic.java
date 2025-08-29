package com.Abstract.programs;
 abstract class Person
 {
     static
     {
         System.out.println("This is a static block within the Abstract Class");
     }
 }
 class DisplayClass extends Person
 {

 }
public class AbstractStatic {
    public static void main(String[] args) {
        Person ob=new DisplayClass();
    }
}
