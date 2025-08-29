package com.gradle.projects;
interface Aplhabets
{
    void alpha(String alphas);
}
interface AlphaNumeric
{
    void alphaNum(String anum);
}
abstract class Letters
{
    
}
class Words extends Letters implements Aplhabets,AlphaNumeric
{
    public void alpha(String alphas)
    {
        System.out.println(alphas);
    }
    public void alphaNum(String anum)
    {
        System.out.println(anum);
    }
}
public class MultipleInheritanceAbstractDemo {
    public static void main(String[] args) {
        Words ob=new Words();
        ob.alpha("ABCDEF");
        ob.alphaNum("A1B2C3DF45");
    }
}
