package com.stepit.Practice2;

import java.util.Scanner;

public class CW2 {
    //    public static void main(String[] args){
//        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//        for (int i = 0; i < cars.length; i++) {
//             System.out.println(cars[i]);
//        }
//    }
//}

//    public class CW2 {
//    static void myMethod() {
//        System.out.println("I just got executed!");
//    }
//    public static void main(String[] args) {
//        myMethod();
//        myMethod();
//        myMethod();
//    }
//}


//    static void myMethod(String fname) {
//        System.out.println(fname + " Refsnes");
//    }
//    public static void main(String[] args) {
//        myMethod("Liam");
//        myMethod("Jenny");
//        myMethod("Anja");
//    }
//}


//        static int myMethod ( int x){
//            return 5 + x;
//            }
//        public static void main (String[]args){
//            System.out.println(myMethod(3));
//        }
//    }


//    static int checkAge(int age) {
//    if (age < 18) {
//        System.out.println("Access denied - You are not old enough!");
//        } else {
//        System.out.println("Access granted - You are old enough!");
//        }
//        return age;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(checkAge(19));
//    }
//}




//    static int plusMethodInt(int x, int y) {
//    return x + y;
//    }
//    static double plusMethodDouble (double x, double y) {
//        return x + y;
//    }
//    public static void main(String[] args) {
//        int myNum1 = plusMethodInt(8, 5);
//        double myNum2 = plusMethodDouble(4.3, 6.26);
//        System.out.println("int: " + myNum1);
//        System.out.println("double: " + myNum2);
//    }
//}


//    static int plusMethod(int x, int y) {
//        return x + y;
//    }
//    static double plusMethod (double x, double y) {
//        return x + y;
//    }
//    public static void main(String[] args) {
//        int myNum1 = plusMethod(8, 5);
//        double myNum2 = plusMethod(4.3, 6.26);
//        System.out.println("int: " + myNum1);
//        System.out.println("double: " + myNum2);
//    }
//}




//    public static void main(String[] args) {
//        int result = sum(10);
//        System.out.println(result);
//    }
//    public static int sum(int k) {
//    if (k > 0){
//    return k + sum(k - 1);
//    } else {
//        return 0;
//    }
//    }
//}




//    public static void main(String[] args) {
//        int result = sum(5, 10);
//        System.out.println(result);
//    }
//
//    public static int sum(int start, int end) {
//        if (end > start) {
//            return end + sum(start, end - 1);
//        } else {
//            return end;
//        }
//    }
//}




        public static void main(String[] args) {
            int[] intPractice;
            int[] intPractice1 = new int[20];
//        int[] intPractice2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] intPractice3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
////        for (int i = 0; i < intPractice2.length; i++)
////            System.out.println("Element at index " + i + " : " + intPractice2[i]);
////        for (int p:intPractice3)
////            System.out.println("El at idx " + p);
//        arrayDisplay(intPractice3);
//        intPractice1[0] = 15;
//        Random r = new Random();
//        intPractice1[1] = r.nextInt(1000);
//        int a = 5;
//        int b = 55;
//        intPractice1[2] = (int) ((Math.random() * (b - a+1)) + a);
//        System.out.println("Random " + intPractice1[2]);
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter fourth element ");
//        intPractice1[3] = in.nextInt();
//        intPractice1 = fullArray(intPractice1);
//        System.out.println("Array after first population ");
//        arrayDisplay(intPractice1);


            int[] intPractice2 = fullArray(10, 5, 10);
            System.out.println("Array after second population ");
            arrayDisplay(intPractice2);
        }
        public static void arrayDisplay(int[] array){
            for (int p:array)
                System.out.println(p);
        }


        public static int[] fullArray(int[] array) {
            Scanner in = new Scanner(System.in);
            for (int p : array) {
                System.out.println("Enter element ");
                p = in.nextInt();
            }
            arrayDisplay(array);
            return array;
        }
        public static int[] fullArray(int size, int min, int max) {
            int[] array = new int[size];
            for (int i = 0; i < size; i++){
                array[i] = (int) ((Math.random() * (max - min+1)) + min);
            }
            arrayDisplay(array);
            return array;
        }
}