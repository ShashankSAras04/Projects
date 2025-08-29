package com.staticprograms.example;

class AreaTri
{
    static float Display(int base,int height)
    {
        float area=0f;
        return area = (0.5f*base*height);
    }

}
public class StaticAreaOfTriangle
{
    public static void main(String[] args)
    {
        float val=AreaTri.Display(6,3);
        System.out.println(val);
    }

}

