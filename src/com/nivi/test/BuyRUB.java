package com.nivi.test;

public class BuyRUB {
    public static void chooseBank(double[] a) {
        int n = a.length;
        double p = a[0];
        int bankNumb = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] > p) {
                p = a[i];
                bankNumb = i + 1;
            }
        }
        System.out.println("Choose the bank number: " + bankNumb + " with rate: " + p);
    }
}
