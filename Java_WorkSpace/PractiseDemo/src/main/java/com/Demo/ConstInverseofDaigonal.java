package com.Demo;
class ConstInverse
{
    ConstInverse(int[][] arr){
        if (arr.length == arr[0].length)
        {
            int k = arr[0].length-1;

            for (int i =0;i< arr.length;i++)
            {
                for (int j=0;j<arr[i].length;j++)
                {
                    if (j==k)
                    {
                        System.out.print(arr[i][j]+" ");
                        k--;
                    }
                    else {
                        System.out.print("@ ");
                    }


                }

                System.out.println();
            }
        }
        else {
            System.out.println(" not possible");
        }
    }
}
public class ConstInverseofDaigonal {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},
                {4,5,6},
                {7,8,9}};
        ConstInverse obj=new ConstInverse(arr);

    }
}
