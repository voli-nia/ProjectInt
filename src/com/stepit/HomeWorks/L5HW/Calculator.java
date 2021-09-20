package com.stepit.HomeWorks.L5HW;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        String operation;


        System.out.print("Enter first integer: ");
        num1 = input.nextInt();
        System.out.print("Enter calculation operation: ");
        operation = input.next(); //.charAt(0);
        System.out.print("Enter second integer: ");
        num2 = input.nextInt();

        if (operation.equals("+")){
            System.out.println(num1 + num2);
        } else if (operation.equals("-")) {
            System.out.println(num1 - num2);
        } else if (operation.equals("*")) {
            System.out.println(num1 * num2);
        } else if (operation.equals("/")) {
            System.out.println(num1*1f / num2*1f);
        } else if (operation.equals("%")) {
            System.out.println(num1 % num2);
        } else if (operation.equalsIgnoreCase("avg")) {
            System.out.println((num1 + num2)/2);
        } else {
            System.out.println("System error");
        }
    }

}
