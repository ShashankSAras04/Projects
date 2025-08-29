package com.sgtest.programs;



class Two_Wheeler{
    String VechileId;
    String VName;
    String VHolder;
    String Vweight;
}
class Three_Wheeler{
    String VechileID;
    String VName;
    String VHolder;
    String Vweight;
    String VColor;
}
class Four_Wheeler{
    String VechileID;
    String VName;
    String VHolder;
    String Vweight;
    String VColor;
    String NoOfStrokes;
}

public class Vehicles {
    public static void main(String[] args) {
        Two_Wheeler obj1=new Two_Wheeler();
        obj1.VechileId= "T201";
        obj1.VName="Honda Scooty";
        obj1.VHolder="kiran";
        obj1.Vweight="110 KG";
        System.out.println("Vechile ID : "+obj1.VechileId);
        System.out.println("Vechile Name : "+obj1.VName);
        System.out.println("Vechile Holder Name : "+obj1.VHolder);
        System.out.println("Vechile Weight : "+obj1.Vweight);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        Three_Wheeler obj2=new Three_Wheeler();
        obj2.VechileID="T301";
        obj2.VName="Bajaj Auto";
        obj2.VHolder="Rajanna";
        obj2.VColor="Black";
        obj2.Vweight="450 KG";
        System.out.println("Vechile ID : "+obj2.VechileID);
        System.out.println("Vechile Name : "+obj2.VName);
        System.out.println("Vechile Holder Name : "+obj2.VHolder);
        System.out.println("Vechile Weight : "+obj2.Vweight);
        System.out.println("Vechile Color : "+obj2.VColor);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        Four_Wheeler obj3=new Four_Wheeler();
        obj3.VechileID="F401";
        obj3.VName="Suzuki Swift Dezire";
        obj3.VHolder="Meeraj";
        obj3.VColor="Sliver";
        obj3.Vweight="1100 KG";
        obj3.NoOfStrokes="5 Strokes";
        System.out.println("Vechile ID : "+obj3.VechileID);
        System.out.println("Vechile Name : "+obj3.VName);
        System.out.println("Vechile Holder Name : "+obj3.VHolder);
        System.out.println("Vechile Weight : "+obj3.Vweight);
        System.out.println("Vechile Color : "+obj3.VColor);
        System.out.println("Vechile Number of Strokes : "+obj3.NoOfStrokes);
    }
}
