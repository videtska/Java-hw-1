package com.nivi.test;

public class EqualsInNumber {
    public static boolean checkEquals(int x) {
        if ((x % 100 / 10 == x % 10) || (x % 10 == x / 100) || (x / 100 == x % 100 / 10)) {
            return true;
        }
        else return false;
    }
}
