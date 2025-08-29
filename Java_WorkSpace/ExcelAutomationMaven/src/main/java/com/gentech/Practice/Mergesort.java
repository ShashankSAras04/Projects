package com.gentech.Practice;

public class Mergesort {
    private static void mergesort(int[] arr, int left, int rigth) {
        if(left<rigth)
        {
            int mid=(left+rigth)/2;
            mergesort(arr,left,mid);
            mergesort(arr,mid+1,rigth);

            merge(arr,left,mid,rigth);
        }
    }

    private static void merge(int[] arr, int left, int mid, int rigth) {
        int n1=(mid-left+1);
        int n2=rigth-mid;
        int larr[]=new int[n1];
        int rarr[]=new int[n2];

        for(int x=0;x<n1;x++)
        {
            larr[x]=arr[left+x];
        }
        for(int x=0;x<n2;x++)
        {
            rarr[x]=arr[mid+1+x];
        }

        int i=0;
        int j=0;
        int k=left;

        while(i<n1 && j<n2)
        {
            if(larr[i] >= rarr[j])
            {
                arr[k]=larr[i];
                i++;
            }
            else {
                arr[k]=rarr[j];
                j++;
            }
            k++;
        }

        while(i<n1)
        {
            arr[k]=larr[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            arr[k]=rarr[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int arr[]={80,48,78,68,397,26};
        mergesort(arr,0,arr.length-1);
        for(int n:arr)
        {
            System.out.println(n);
        }
    }


}
