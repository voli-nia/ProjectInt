package com.stepit.HomeWorks.L7HW;

import java.util.Scanner;

public class TheLongestWord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, write down your sentence: ");

        int size = 0;
        String theLongestWord = " ";
        String str = sc.nextLine();

        for (String b : str.split(" ")) {
            if (theLongestWord.length() == 0) {
                size = b.length();
                theLongestWord = b;
            } else if (b.length() >= size) {
                size = b.length();
                theLongestWord = b;
            }
            }
            sc.close();
            System.out.println("The longest word from your setence is: " + theLongestWord);
            System.out.println("The length of the word is: " + size);
    }
}

