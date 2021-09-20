package com.stepit.HomeWorks.L6HW;

import java.util.Scanner;

public class YearsBeforePension {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter your sex: m - for male, f - to female");
        String sex = input.next();

        System.out.println("Please, enter how old you are: ");
        int age = input.nextInt();

        if (sex.equals("m")) {
            if (age < 70) {
                System.out.println("You have " + (70 - age) + " years left until your retirement");
            }
                else if (age == 70) {
                System.out.println("You retired this year");
            } else System.out.println("You retired " + (age - 70) + " years ago");
        } else if (sex.equals("f")) {
            if (age < 65) {
                System.out.println("You have " + (65 - age) + " years left until your retirement");
            }
                else if (age == 65) {
                System.out.println("You retired this year");
            } else System.out.println("You retired " + (age - 65) + " years ago");
            }
        }
    }
