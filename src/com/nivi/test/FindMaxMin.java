package com.nivi.test;

public class FindMaxMin {
    public static int findMax(int[] a) {
        int n = a.length;
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static int findMin(int[] a) {
        int n = a.length;
        int min = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public static int sumMaxMin(int[] a) {
        int maxN = findMax(a);
        int minN = findMin(a);
        int sum = maxN + minN;
        System.out.println(sum);
        return sum;
    }
}
