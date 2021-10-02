package com.stepit.HomeWorks.L7HW;

import java.util.Scanner;

public class ArrayReverse {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int origArray;
        System.out.println("Choose how many elements you want to introduce: ");
        origArray = input.nextInt();

        int[] initArray = new int[origArray];
        System.out.println("Original Array: ");
        for (int i = 0; i < initArray.length; i++) {
            initArray[i] = input.nextInt();
        }

        System.out.println("Reversed Array: ");
        for (int i = initArray.length - 1; i >= 0; i--)
            System.out.println(initArray[i]);
    }
}
