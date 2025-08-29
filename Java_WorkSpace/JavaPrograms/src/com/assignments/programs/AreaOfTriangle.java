package com.assignments.programs;

class AreaTri
{
    float Display(int base,int height)
    {
        float area=0f;
        return area = (0.5f*base*height);
    }

}
public class AreaOfTriangle
{
    public static void main(String[] args)
    {
        AreaTri obj1=new AreaTri();
        float val=obj1.Display(6,3);
        System.out.println(val);
    }

}
