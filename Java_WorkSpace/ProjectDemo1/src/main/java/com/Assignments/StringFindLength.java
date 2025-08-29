package com.Assignments;
class FindLength
{
    static void FLength(String name)
    {
        int count=0;
        char c[]=name.toCharArray();
        for(char k:c)
        {
            count=count+1;

        }
        System.out.println(count);
    }


}
public class StringFindLength {
    public static void main(String[] args) {
        FindLength.FLength("gentech");

    }
}
