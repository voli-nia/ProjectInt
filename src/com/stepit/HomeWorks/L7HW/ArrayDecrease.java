package com.stepit.HomeWorks.L7HW;

import java.util.Scanner;

public class ArrayDecrease {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int nrOfElements;
            System.out.println("Enter the number of elements that should be decreased on 25%: ");
            nrOfElements = input.nextInt();

            int[] elDecr = new int[nrOfElements];
            System.out.println("Enter the elements: ");
            for (int i = 0; i < elDecr.length; i++) {
                elDecr[i] = input.nextInt();
            }

            for (int i = 0; i < elDecr.length; i++) {
                elDecr[i] = elDecr[i] - elDecr[i]*25/100;
            }
            for (int i = 0; i < elDecr.length; i++) {
                System.out.println(elDecr[i]);
            }
        }
}

