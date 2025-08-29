package com.sgtest.programs;

public class AlphaPattern {
    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {
            char c='A';
            for (int j = 5; j >= i; j--) {
                System.out.print(c+ " ");
                c++;
            }
            System.out.println();

        }
    }
}
