package com.Assignments;

public class AddCommaWithoutMethod
{
    public static void main(String[] args)
    {
        String weekdays = "SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";
        String result = "";
        for (int i = 0; i < weekdays.length(); i++)
        {
            result += weekdays.charAt(i);
            if (weekdays.charAt(i) == 'Y')
            {
                result += ",";
            }
        }
        System.out.println(result);

    }
}
