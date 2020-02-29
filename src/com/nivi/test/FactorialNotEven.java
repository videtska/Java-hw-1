package com.nivi.test;

public class FactorialNotEven {
    public static int countSumFact(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += Factorial.calculationFactorialEasy(i);
            } else {
                continue;
            }
        }
        return sum;
    }
}
