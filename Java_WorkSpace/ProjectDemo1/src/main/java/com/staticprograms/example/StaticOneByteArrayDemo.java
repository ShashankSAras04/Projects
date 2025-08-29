package com.staticprograms.example;

class ByteArrayDemo
{
    static byte[] Display()
    {
        byte arr[]={1,2,3,4,5,6,7};
        return arr;
    }

}
public class StaticOneByteArrayDemo
{
    public static void main(String[] args) {

        byte a[]= ByteArrayDemo.Display();
        for(byte k:a)
        {
            System.out.print(k+" ");
        }
    }
}
