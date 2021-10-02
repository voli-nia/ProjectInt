package com.stepit.HomeWorks.L7HW;

import java.util.Scanner;
import static java.lang.Integer.MAX_VALUE;

public class ArrayMinElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nrElem;
        System.out.println("Enter how many elements you want to introduce: ");
        nrElem = input.nextInt();

        int[] myArray = new int[nrElem];
        System.out.println("Your string with elements: ");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = input.nextInt();
        }

        int min = MAX_VALUE;

        for (int i = 0; i < myArray.length; i++) {
            min = Math.min(min, myArray[i]);
        }

        System.out.println("The minimum element from your string is: " + min);
    }
}
