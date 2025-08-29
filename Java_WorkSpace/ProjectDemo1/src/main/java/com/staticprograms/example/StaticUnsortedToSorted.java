package com.staticprograms.example;

class SortDemo1
{
    static int[] Display(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                int p=j+1;
                if(p<arr.length)
                {
                    if(arr[j]>arr[p])
                    {
                        int temp = arr[p];
                        arr[p] = arr[i];
                        arr[i] = temp;
                        //p++;
                    }

                }

            }
        }
        return arr;
    }
}
public class StaticUnsortedToSorted {
    public static void main(String[] args) {
        SortDemo1 obj1=new SortDemo1();
        int[] a={9,8,7,6,5};
        int[] c=SortDemo1.Display(a);
        for(int k:c)
        {
            System.out.println(k);
        }
    }
}
