package com.Demo;

public class SortArray {
    int[] getSort(int num[])
    {
        for(int i=0;i<num.length;i++)
        {
            for(int j=0;j<num.length-i;j++)
            {
                int index=j+1;
                if(index<num.length)
                {
                    if (num[j] < num[index])
                    {
                        int temp = num[index];
                        num[index] = num[j];
                        num[j] = temp;
                    }
                }
            }
        }
        return num;

    }

    public static void main(String[] args) {
        SortArray ob=new SortArray();
        int arr[]={89,56,34,98};
        int res[]=ob.getSort(arr);
        for(int i:res)
        {
            System.out.print(i+" ");
        }
    }
}
