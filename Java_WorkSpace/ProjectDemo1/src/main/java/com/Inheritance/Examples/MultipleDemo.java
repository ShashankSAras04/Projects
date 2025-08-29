package com.Inheritance.Examples;
class ColorsMain
{
    String colorname;
    void show()
    {
        System.out.println("Color name is "+colorname);
    }
}
class Rgb extends ColorsMain{
    String colorname;
    Rgb(String cname)
    {
        super.colorname=cname;
    }
    void Display()
    {
        System.out.println("Sub class color name is "+colorname);
    }
}
class CmykColor extends Rgb{
    String colorname;
    CmykColor(String name,String clname,String c2color)
    {
        super(c2color);
        super.colorname=name;
        colorname=clname;
    }
    void Display1()
    {
        System.out.println("Subcalss color name is "+colorname);
    }


}
public class MultipleDemo {
    public static void main(String[] args) {
        CmykColor ob=new CmykColor("red","blue","green");
        ob.show();
        ob.Display();
        ob.Display1();
    }
}
