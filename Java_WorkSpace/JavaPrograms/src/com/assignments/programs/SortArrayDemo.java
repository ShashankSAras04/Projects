package com.assignments.programs;

class SortDemo {
    void Sorting(int a[])
    {
        for (int k = 0; k < a.length; k++)
        {
            for (int j = 0; j < a.length; j++)
            {
                int i = j + 1;
                if (i < a.length)
                {
                    if (a[j] > a[i])
                    {
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }

        }
        for(int k : a)
        {
            System.out.println(k);
        }
    }
}
public class SortArrayDemo {
    public static void main(String[] args)
    {
        int c[]={18,19,16,2,1,4,19,15,14,10,0};
        SortDemo obj1=new SortDemo();
        obj1.Sorting(c);
    }
}
