package com.stepit.Practice3;

import java.util.Scanner;

public class EvenOrOdd {
    static boolean isEven(int number) {
        return number %2 == 0;
    }
    public static void main(String[] args) {
        System.out.println("Enter your number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (isEven(num)) {
            System.out.println("Number is even");
        } else System.out.println("Number is odd");
    }

}
