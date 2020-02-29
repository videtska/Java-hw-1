package com.nivi.test;

public class Discount {
    public static void countDiscount(int n) {
        if (n <= 1000) {
            System.out.println("No discount!");
        } else {
            if (n > 1000 && n <= 2000) {
                System.out.println("Discount 2%. Total price: " + (n - n * 0.02));
            } else {
                if (n > 2000 && n <= 5000) {
                    System.out.println("Discount 5%. Total price: " + (n - n * 0.05));
                } else {
                    System.out.println("Discount 7%. Total price: " + (n - n * 0.07));
                }

            }
        }
    }
}