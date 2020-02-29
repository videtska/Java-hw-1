package com.nivi.test;

public class Factorial {
    public static int calculationFactorialRec(int x) {
        if (x == 1) {
            return 1;
        }
        return x * calculationFactorialRec(x - 1);
    }

    public static int calculationFactorialEasy(int x) {
        int res = 1;
        for (int i = 1; i <=  x; i++) {
            res *= i;
        }
        return res;
    }
}
