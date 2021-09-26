package com.stepit.HomeWorks.L6HW;

import java.util.Scanner;

public class StoreDiscount {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        boolean calculate = true;
        int moneySpent = 0;

        while (calculate) {
            int prodQuant;
            System.out.println("Enter the number of products you bought in the store: ");
            prodQuant = input.nextInt();

            int[][] itemPrices = new int[prodQuant][2];
            for (int i = 0; i < itemPrices.length; i++) {
                System.out.println("Enter the product price: ");
                itemPrices[i][0] = input.nextInt();
                System.out.println("Enter the quantity: ");
                itemPrices[i][1] = input.nextInt();
            }

            for (int i = 0; i < itemPrices.length; i++) {
                moneySpent = moneySpent + (itemPrices[i][0] * itemPrices[i][1]);
            }

            if (moneySpent < 1000) {
                System.out.println("You need to spend " + (1000 - moneySpent) + " more to get 10% off discount");
                System.out.println("Do you want to add something? (Y/N)");
                String inp = input.next();
                if (inp.equalsIgnoreCase("y")) {
                    calculate = true;
                } else if (inp.equalsIgnoreCase("n")) {
                    calculate = false;
                } else {
                    System.out.println("System error");
                    break;
                }

            } else if (moneySpent >= 1000 && moneySpent < 10000) {
                System.out.println("Total price is " + moneySpent + " \n"+
                        "Congratulations! You have 10% off discount! You have spent " + (moneySpent - (moneySpent * 10 / 100)) + " \n" +
                        "You have saved " + (moneySpent * 10 / 100));
                calculate = false;
            } else {
                System.out.println("Total price is " + moneySpent + " \n" +
                        "Congratulations! You have 10% off discount! You have spent " + (moneySpent - (moneySpent * 20 / 100)) + " \n" +
                        "You have saved " + (moneySpent * 20 / 100));
                calculate = false;
            }
        }
    }
}
