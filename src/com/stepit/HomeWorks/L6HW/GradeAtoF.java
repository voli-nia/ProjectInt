package com.stepit.HomeWorks.L6HW;

import java.util.Scanner;

public class GradeAtoF {
        public static void main(String[] args) {
            System.out.println("Enter grade you want to convert: ");
            Scanner input = new Scanner(System.in);
            int letter = input.nextInt();
            convertGradeToLetter(letter);
    }

    public static void convertGradeToLetter(int num) {
            switch (num) {
                case 91, 92, 93, 94, 95, 96, 97, 98, 99, 100 -> System.out.println("A");
                case 81, 82, 83, 84, 85, 86, 87, 88, 89, 90 -> System.out.println("B");
                case 71, 72, 73, 74, 75, 76, 77, 78, 79, 80 -> System.out.println("C");
                case 61, 62, 63, 64, 65, 66, 67, 68, 69, 70 -> System.out.println("D");
                case 51, 52, 53, 54, 55, 56, 57, 58, 59, 60 -> System.out.println("E");
                case 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 -> System.out.println("F");
                default -> System.out.println("System error. Unknown grade. Starts from 41 points");
            }
        }
    }
