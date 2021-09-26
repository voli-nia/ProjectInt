package com.stepit.HomeWorks.L6HW;

import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nrOfStud;
        System.out.println("Enter the number of students in the group: ");
        nrOfStud = input.nextInt();

        int[] studGrades = new int[nrOfStud];
        System.out.println("Enter student grades: ");
        for (int i = 0; i < studGrades.length; i++) {
            studGrades[i] = input.nextInt();
        }

        int sumGrade = 0;
        for (int i = 0; i < studGrades.length; i++) {
            sumGrade = sumGrade + studGrades[i];
        }

        System.out.println("The average score of the group is: " + (sumGrade*1f / nrOfStud*1f));
    }
}
