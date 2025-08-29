package com.Assignments;

public class RemoveDay {
    public static void main(String[] args) {
        String weekdays="SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";
        String wk[]=weekdays.split("DAY");
        for(String k:wk)
        {
            System.out.print(k+" ");
        }
    }
}
