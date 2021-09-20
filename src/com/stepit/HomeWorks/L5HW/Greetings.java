package com.stepit.HomeWorks.L5HW;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        System.out.print(
                "For ENG press 1 \n" +
                        "For RU press 2 \n" +
                        "For RO press 3 \n" +
                        "Choose your language: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        switch (num) {
            case 1 -> System.out.println("Hello!");
            case 2 -> System.out.println("Привет!");
            case 3 -> System.out.println("Noroc!");
            default -> System.out.println("Input error");
        }

    }
}
