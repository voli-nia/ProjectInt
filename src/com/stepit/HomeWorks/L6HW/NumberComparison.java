package com.stepit.HomeWorks.L6HW;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NumberComparison {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;

        System.out.println("Enter first number: ");
        number1 = input.nextInt();

        System.out.println("Enter second number: ");
        number2 = input.nextInt();

        if (number1 == number2) {
            System.out.println(number1 + " == " + number2);
        } else if (number1 > number2) {
            System.out.println(number1 + " > " + number2);
        } else {
            System.out.println(number1 + " < " + number2);
        }

    }
}
