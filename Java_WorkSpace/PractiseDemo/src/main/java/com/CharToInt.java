package com;

class CharToInt {
    public static void main(String[] args) {
        int[] arr = {89, 99, 23, 28, 19, 40, 100};
        int highest = arr[0];
        int secondHighest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < highest) {
                secondHighest = highest;
                highest = arr[i];
            } else if (arr[i] < secondHighest && arr[i] != highest) {
                secondHighest = arr[i];
            }
        }

        System.out.println(secondHighest);
    }
}
