package com.Demo;

public class AddTwoArrays {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,9};
        int arr2[]={3,4,5,6,7};
        if(arr1.length== arr2.length)
        {
            for(int i=0;i<arr1.length;i++)
            {
                System.out.println(arr1[i]+arr2[i]);
            }
        }
        else {
            System.out.println("array length are not equal");
        }


        int arr8[]={1,2,3,4,5};
        int arr9[]={3,4,5,6,7,9};

        if(arr8.length==arr9.length)
        {
            int arr10[]=new int[arr8.length];
            for (int i = 0; i < arr8.length; i++)
            {
                arr10[i] = arr8[i] + arr9[i];
            }
            for(int k:arr10)
            {
                System.out.println(k);
            }
        }
        else
        {
            System.out.println("Length are not equal");
        }

    }
}
