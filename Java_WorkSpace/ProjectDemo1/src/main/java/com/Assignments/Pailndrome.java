package com.Assignments;

class CheckPalindrome
{
    static void Check(String name)
    {
        String reveresedname="";
        for(int i=name.length()-1;i>=0;i--)
        {
            reveresedname =reveresedname+name.charAt(i);
        }
        if(name.equalsIgnoreCase(reveresedname))
        {
            System.out.println(name+" is Palindrome");
        }
        else {
            System.out.println(name+" is not a plaindrome");
        }
    }
}
public class Pailndrome {
    public static void main(String[] args) {
        CheckPalindrome.Check("Madam");
        CheckPalindrome.Check("Level");
    }
}
