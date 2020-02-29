package com.nivi.test;

public class MatrixZero {
    public static void calcZero(int a) {
        for (int i = 0; i <= a; i++) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print(0);
            }
        }
    }
}
