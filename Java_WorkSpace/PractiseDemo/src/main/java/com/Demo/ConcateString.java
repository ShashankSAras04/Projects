package com.Demo;

public class ConcateString {
    static String getconcate(String[] arr)
    {
        String names="";
        for(int i=0;i<arr.length;i++)
        {
           names = names + arr[i]+" ";
        }

        return names;
    }

    public static void main(String[] args) {
        String val[]={"This","is","GenTech"};
        String res=ConcateString.getconcate(val);
        System.out.println(res);
    }
}
