package com.stepit.Practice3;

import java.util.Scanner;

public class ArabicToRoman {
        public static void main(String[] args) {
//        System.out.println("Enter arabic number: ");
//        Scanner input = new Scanner(System.in);
//        int arabic = input.nextInt();
//            repeat(5);
//            repeat();
//
//        }
//        convertArabicToRoman(arabic);
        }
        static void convertArabicToRoman(int num) {
            switch (num) {
                case 1 -> System.out.println("I");
                case 5 -> System.out.println("V");
                case 10 -> System.out.println("X");
                case 50 -> System.out.println("L");
                case 100 -> System.out.println("C");
                case 1000 -> System.out.println("M");
                default -> System.out.println("Unexpected input. Try one of the following: 1, 5, 10, 50, 100, 1000");
            }
        }




        static int enterInt() {
            System.out.println("Enter arabic number: ");
            Scanner input = new Scanner(System.in);
            int arabic = input.nextInt();
            return arabic;
        }




        static void repeat(int times){
            for (int i = times; i > 0; i--){
                System.out.println(i + " Transactions left");
                convertArabicToRoman(enterInt());
            }
        }


//        static void repeat(){
//            System.out.println("Enter arabic number: ");
//            Scanner input1 = new Scanner(System.in);
//            int arabic = input1.nextInt();
//            convertArabicToRoman(arabic);
//            System.out.println("Do you want to continue? y/n");
//            Scanner input2 = new Scanner(System.in);
//            String answer = input2.nextLine();
//            if (answer.equals("y")){
//                repeat();
//            } else if (answer.equals("n")) {
//                return;
//            } else System.out.println("Incorrect input, please choose y or n ");
//        }
}