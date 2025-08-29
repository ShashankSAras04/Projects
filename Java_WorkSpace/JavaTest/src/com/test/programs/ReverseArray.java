package com.test.programs;
class MainDemo
{
    void Diplay(double a[])
    {
        int v[]=new int[a.length];
        int k=0;
        for(double j:a)
        {
           v[k]=(int)j;
           k++;
        }
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.println(v[i]);
        }
    }
}
public class ReverseArray {
    public static void main(String[] args) {
        double arr[]={10.2,20.2,30.30};
        MainDemo obj1=new MainDemo();
        obj1.Diplay(arr);
    }

}
