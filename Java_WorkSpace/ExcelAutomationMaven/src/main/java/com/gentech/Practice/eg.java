package com.gentech.Practice;


class run{
    void mul(int x, int y){
        x+=100;
        y+=100;
    }
}
public class eg {
    public static void main(String[] args) {
        int x=10;
        int y=10;
        System.out.println("bo" +x);
        System.out.println(y);
        run o=new run();
        o.mul(x,y);
        System.out.println(x);
        System.out.println(y);
    }
}
