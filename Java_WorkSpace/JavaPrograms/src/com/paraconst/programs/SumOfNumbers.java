package com.paraconst.programs;
class EvenNumber
{
    void EvenDemo1(int i,int j){
        int sum=0;
        for(i=i;i<=j;i++)
        {
            if((i%2)==0)
            {
                sum=sum+i;
            }
        }
        System.out.println("sum of Even "+sum);
    }
}
public class SumOfNumbers {
    public static void main(String[] args) {
        EvenNumber obj1=new EvenNumber();
        obj1.EvenDemo1(30,50);
    }
}
