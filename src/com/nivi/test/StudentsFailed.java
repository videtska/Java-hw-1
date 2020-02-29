package com.nivi.test;

public class StudentsFailed {
    public static int checkGrades(int[] a, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 2) count++;
        }
        return count;
    }
}
