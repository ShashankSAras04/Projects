package com.test.programs;

class EvenOddDemo
{
    void Dispaly(int i,int j)
    {
        int evensum=0;
        int oddsum=0;
        for(int p=i;p<=j;p++)
        {
            if(p%2==0)
            {
                evensum=evensum+p;
            }
            else
            {
                oddsum=oddsum+p;;
            }
        }
        int result=(evensum*oddsum);
        System.out.println(result);
    }
}
public class EvenOdd {
    public static void main(String[] args) {
        EvenOddDemo obj1=new EvenOddDemo();
        obj1.Dispaly(1,20);
    }
}
