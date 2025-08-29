package com.Demo;

public class FibonacciSeries {
    public static void main(String[] args) {
        int fnum=0;
        int snum=1;
       // int rnum=0;
        System.out.println(fnum);
        System.out.println(snum);
        for(int i=1;i<=8;i++)
        {
            int rnum=fnum+snum;
            fnum=snum;
            snum=rnum;
            System.out.println(rnum);
        }
    }
}
