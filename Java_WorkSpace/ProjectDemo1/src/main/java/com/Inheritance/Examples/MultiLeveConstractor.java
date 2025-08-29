package com.Inheritance.Examples;

class Addition1
{
    Addition1(int i,int j){
        int result= i+j;
        System.out.println("Addition of Two Numbers "+result);
    }
}
class Substraction1 extends Addition1
{
    Substraction1(int p,int q){
        super(p,q);
        int result= q-p;
        System.out.println("Substraction of Two Numbers "+result);
    }
}
class Multiplication1 extends Substraction1
{
    Multiplication1(int m,int n){
        super(m,n);
        int result= m*n;
        System.out.println("Multiplication of Two Numbers "+result);
    }
}

public class MultiLeveConstractor {
    public static void main(String[] args) {
        Multiplication1 o1=new Multiplication1(30,40);

    }
}
