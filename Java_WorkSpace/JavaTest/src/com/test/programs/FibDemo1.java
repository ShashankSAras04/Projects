package com.test.programs;

class Fibb1
{
    void Display(int first, int second)
    {
        int fn = first;
        int sn = second;
        int  sum=0;
        int tn=0;
            for (int count = 2; count <= 10; count++)
            {
                tn=fn+tn;
                fn=sn;
                sn=tn;
                sum=sum+tn;
            }

        System.out.println("Sum of the first 10 Fibonacci numbers: " + sum);
    }
}

public class FibDemo1 {
    public static void main(String[] args) {
        Fibb1 obj1 = new Fibb1();
        obj1.Display(0, 1);
    }
}
