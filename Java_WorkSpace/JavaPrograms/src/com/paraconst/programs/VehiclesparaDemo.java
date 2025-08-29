package com.paraconst.programs;

class Two_Wheeler{
    String VechileId;
    String VName;
    String VHolder;
    String Vweight;
    Two_Wheeler(String id,String name,String vname,String weight){
        VechileId= id;
        VName=name;
        VHolder=vname;
        Vweight=weight;
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
    Three_Wheeler(String id,String name,String holder,String vcolor,String weight){
        VechileID=id;
        VName=name;
        VHolder=holder;
        VColor=vcolor;
        Vweight=weight;
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
    Four_Wheeler(String id,String name,String holder,String color,String weight,String strokes){
        VechileID=id;
        VName=name;
        VHolder=holder;
        VColor=color;
        Vweight=weight;
        NoOfStrokes=strokes;
        System.out.println("Vechile ID : "+VechileID);
        System.out.println("Vechile Name : "+VName);
        System.out.println("Vechile Holder Name : "+VHolder);
        System.out.println("Vechile Weight : "+Vweight);
        System.out.println("Vechile Color : "+VColor);
        System.out.println("Vechile Number of Strokes : "+NoOfStrokes);
    }
}
public class VehiclesparaDemo {
    public static void main(String[] args) {
       Two_Wheeler obj1 = new Two_Wheeler("T02","Yamaha Scooty","Rajesh","130 KG");
       Three_Wheeler obj2 = new Three_Wheeler("T03","Auto","Suman","Green","350 KG");
       Four_Wheeler obj3 = new Four_Wheeler("F01","Swift Dezire","Riman","Silver","1100KG","5 Strokes");
    }
}
