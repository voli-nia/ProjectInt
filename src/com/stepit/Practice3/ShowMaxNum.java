package com.stepit.Practice3;

import java.util.Scanner;

public class ShowMaxNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter your first number ");
        int number1 = input.nextInt();


        System.out.println("Enter your second number ");
        int number2 = input.nextInt();


        int max = (number1 >= number2) ? number1 : number2;


        System.out.println(max);


    }
}