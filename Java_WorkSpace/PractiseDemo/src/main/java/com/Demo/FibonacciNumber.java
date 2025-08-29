package com.Demo;

public class FibonacciNumber {
    int[] getfibo(int num)
    {
        int[] res=new int[num];
        int n1=0;
        int n2=1;
        res[0]=n1;
        res[1]=n2;

        for(int i=2;i<num;i++)
        {
            int temp=n1+n2;
            res[i]=temp;
            n1=n2;
            n2=temp;
        }
        return res;

    }

    public static void main(String[] args) {
        FibonacciNumber ob=new FibonacciNumber();
        int[] arr=ob.getfibo(10);
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}
