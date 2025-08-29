package com.staticprograms.example;

class DaysDemo
{
    static String[] Display()
    {
        String[] WeekDays={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        return WeekDays;
    }
}
public class StaticSevenWeekDays {
    public static void main(String[] args) {

        String[] a=DaysDemo.Display();
        for(String l:a)
        {
            System.out.println(l);
        }
    }

}
