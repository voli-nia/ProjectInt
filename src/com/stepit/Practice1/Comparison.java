package com.stepit.Practice1;

import java.util.Scanner;

public class Comparison {
    // main method begins execution of Java application
    public static void main(String[] args)
    {
        // create Scanner to obtain input from command line
        Scanner input = new Scanner(System.in);


        int number1;
        int number2;


        System.out.print("Enter first integer: ");
        number1 = input.nextInt();


        System.out.print("Enter second integer: ");
        number2 = input.nextInt();


        if (number1 == number2)
            System.out.printf("%d == %d%n", number1, number2);


        if (number1 != number2)
            System.out.printf("%d != %d%n", number1, number2);
        System.out.print(number1 + " != " + number2);
        System.out.println(number1 + " != " + number2);
        System.out.println(number1 + " != " + number2);




        if (number1 < number2)
            System.out.printf("%d < %d%n", number1, number2);


        if (number1 > number2)
            System.out.printf("%d > %d%n", number1, number2);


        if (number1 <= number2)
            System.out.printf("%d <= %d%n", number1, number2);


        if (number1 >= number2)
            System.out.printf("%d >= %d%n", number1, number2);
    }
}