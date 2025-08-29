package com.Assignments;

class Reverse
{
    Reverse(String name)
    {
        for(int i=name.length()-1;i>=0;i--)
        {
            System.out.print(name.charAt(i));
        }
        System.out.println();
    }
    static void getReverse(String arr)
    {
        char result[]=arr.toCharArray();
        for(int i=result.length-1;i>=0;i--)
        {
            System.out.print(result[i]);
        }
        System.out.println();
    }
    void getSubString(String name)
    {
        for(int i=name.length()-1;i>=0;i--)
        {
               System.out.print(name.substring(i,i+1));
        }
    }
}
public class ReverseString {
    public static void main(String[] args) {
        Reverse ob=new Reverse("GoodMorning");
        Reverse.getReverse("Development");
        ob.getSubString("Testing");

    }
}
