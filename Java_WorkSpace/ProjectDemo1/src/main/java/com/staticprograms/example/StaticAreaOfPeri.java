package com.staticprograms.example;

class Peri
{
    static float Display(int radius)
    {
        float area = (float)(2*Math.PI*radius);
        return area;
    }

}
public class StaticAreaOfPeri
{
    public static void main(String[] args) {
        float val=Peri.Display(4);
        System.out.println(val);
    }
}
