package com.assignments.programs;

class Peri
{
    float Display(int radius)
    {
        float area = (float)(2*Math.PI*radius);
        return area;
    }

}
public class AreaOfPeri
{
    public static void main(String[] args) {
        Peri obj1=new Peri();
        float val=obj1.Display(4);
        System.out.println(val);
    }
}
