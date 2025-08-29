package com.Assignments;

public class AddDelimeterComma {
    public static void main(String[] args) {
        String weekdays = "SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";
        weekdays = weekdays.replace("DAY", "DAY,");
        System.out.println(weekdays);

    }
}
