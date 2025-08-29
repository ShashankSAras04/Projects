package com.Assignments;
class Find
{
    static void length(String name)
    {
        String splitted[]=name.split(" ");
        System.out.println(splitted.length);
    }
}
public class FindStringLength {
    public static void main(String[] args) {
        Find.length("GenTech is a full stack development institute");

    }
}
