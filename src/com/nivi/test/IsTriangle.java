package com.nivi.test;

public class IsTriangle {
    public static boolean checkSides(double a, double b, double c) {
        if (a + b > c && a + c > b && b + c > a) {
            return true;
        } else {
            System.out.println("not a triangle");
            return false;
        }

    }
}
