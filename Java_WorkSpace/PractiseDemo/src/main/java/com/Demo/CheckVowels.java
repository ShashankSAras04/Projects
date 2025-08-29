package com.Demo;

public class CheckVowels {
    static int getcount(String name)
    {
        int count=0;
        for(int i=0;i<name.length();i++)
        {
            if(name.charAt(i) =='A' || name.charAt(i) == 'a' || name.charAt(i) =='E' || name.charAt(i) == 'e' || name.charAt(i) =='I' || name.charAt(i) == 'i' || name.charAt(i) =='O' || name.charAt(i) == 'o' || name.charAt(i) =='U' || name.charAt(i) == 'u' ){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str="this is GenTEch";
        int cnt=CheckVowels.getcount(str);
        System.out.println(cnt);
    }
}
