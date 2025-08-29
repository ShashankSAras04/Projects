package com.assignments.programs;

class DaysDemo
{
    String[] Display()
    {
       String[] Days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
       return Days;
    }
}
public class SevenWeekDays {
    public static void main(String[] args) {
        DaysDemo obj1=new DaysDemo();
        String[] a=obj1.Display();
        for(String l:a)
        {
            System.out.println(l);
        }
    }

}
