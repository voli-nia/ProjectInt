package com.stepit.HomeWorks.L6HW;

import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students in the group: ");
        int a = input.nextInt();
        System.out.println("Enter student grades: ");
        int b = input.nextInt();

        int i = 0;
        while (i < a) {
            System.out.println(i);
            i++;
        }
    }
}
