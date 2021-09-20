package com.stepit.HomeWorks.L5HW;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {
    public static void main(String[] args){
        int min = 0;
        int max = 50;
        int rndNum = ThreadLocalRandom.current().nextInt(min, max + 1);

        System.out.print("Enter first integer: ");
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();

        while (number1 != rndNum) {
            if (number1 > rndNum) {
                System.out.println("Your number is higher. Try Again!");
                number1 = input.nextInt();
            } else if (number1 < rndNum) {
                System.out.println("Your number is lower. Try Again!");
                number1 = input.nextInt();
            }
        }
        if (number1 == rndNum) {
            System.out.println("Good Job!");
        }
    }

}
