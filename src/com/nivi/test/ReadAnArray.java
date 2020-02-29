package com.nivi.test;

import java.util.Scanner;

public class ReadAnArray {
    public static int[] readArrInt(int n) {
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static double[] readAnArrDouble(int n) {
        double[] a = new double[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextDouble();
        }
        return a;
    }
}
