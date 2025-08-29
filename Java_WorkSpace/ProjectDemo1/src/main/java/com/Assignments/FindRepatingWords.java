package com.Assignments;

public class FindRepatingWords {
    public static void main(String[] args) {
        String sentence = "java jre java jvm Java jdk java";
        int count = 0;
        String ch[]=sentence.split(" ");
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i].equalsIgnoreCase("java"))
            {
                count=count+1;
            }
        }
        System.out.println(count);
    }
}
