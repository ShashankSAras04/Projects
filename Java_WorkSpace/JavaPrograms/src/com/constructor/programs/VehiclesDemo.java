package com.constructor.programs;

class Two_Wheeler{
    String VechileId;
    String VName;
    String VHolder;
    String Vweight;
    Two_Wheeler(){
        VechileId= "T201";
        VName="Honda Scooty";
        VHolder="kiran";
        Vweight="110 KG";
        System.out.println("Vechile ID : "+VechileId);
        System.out.println("Vechile Name : "+VName);
        System.out.println("Vechile Holder Name : "+VHolder);
        System.out.println("Vechile Weight : "+Vweight);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

    }
}
class Three_Wheeler{
    String VechileID;
    String VName;
    String VHolder;
    String Vweight;
    String VColor;
    Three_Wheeler(){
        VechileID="T301";
        VName="Bajaj Auto";
        VHolder="Rajanna";
        VColor="Black";
        Vweight="450 KG";
        System.out.println("Vechile ID : "+VechileID);
        System.out.println("Vechile Name : "+VName);
        System.out.println("Vechile Holder Name : "+VHolder);
        System.out.println("Vechile Weight : "+Vweight);
        System.out.println("Vechile Color : "+VColor);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
    }
}
class Four_Wheeler{
    String VechileID;
    String VName;
    String VHolder;
    String Vweight;
    String VColor;
    String NoOfStrokes;
    Four_Wheeler(){
        VechileID="F401";
        VName="Suzuki Swift Dezire";
        VHolder="Meeraj";
        VColor="Sliver";
        Vweight="1100 KG";
        NoOfStrokes="5 Strokes";
        System.out.println("Vechile ID : "+VechileID);
        System.out.println("Vechile Name : "+VName);
        System.out.println("Vechile Holder Name : "+VHolder);
        System.out.println("Vechile Weight : "+Vweight);
        System.out.println("Vechile Color : "+VColor);
        System.out.println("Vechile Number of Strokes : "+NoOfStrokes);
    }
}
public class VehiclesDemo {
    public static void main(String[] args) {
        Two_Wheeler obj1 = new Two_Wheeler();
        Three_Wheeler obj2 = new Three_Wheeler();
        Four_Wheeler obj3 = new Four_Wheeler();
    }
}
