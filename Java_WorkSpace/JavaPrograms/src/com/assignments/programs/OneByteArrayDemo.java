package com.assignments.programs;

class ByteArrayDemo
{
    byte[] Display(byte arr[])
    {
        byte[] c=new byte[arr.length];
        for(int i=0;i< arr.length;i++)
        {
            c[i]=arr[i];
        }
        return arr;
    }

}
public class OneByteArrayDemo
{
    public static void main(String[] args) {
        ByteArrayDemo obj1=new ByteArrayDemo();
        byte arr1[]={1,2,3,4,5,6,7};
        byte a[]= obj1.Display(arr1);
        for(byte k:a)
        {
            System.out.print(k+" ");
        }
    }
}
