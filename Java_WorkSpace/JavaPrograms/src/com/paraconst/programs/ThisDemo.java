package com.paraconst.programs;
class Demo
{
    String name;
    int id;
    Demo(String name,int id)
    {
        this.name=name;
        this.id=id;
        System.out.println(name+id);
    }
    void display()
    {
        System.out.println(this.name+this.id);
    }
}
public class ThisDemo {
    public static void main(String[] args) {
        Demo obj1=new Demo("helo",10);
        obj1.display();

    }
}
