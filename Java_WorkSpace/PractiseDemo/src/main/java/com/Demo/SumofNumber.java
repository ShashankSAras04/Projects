package com.Demo;

public class SumofNumber {
    public static void main(String[] args) {
        int num=524;
        int sum=0;
        while(num>0){
            int rem=num%10;
            //System.out.println(rem);
            sum=sum+rem;
            //System.out.println(sum);
            num =num/ 10;
            //*System.out.println(num);
        }
        System.out.println(sum);
    }
}
