package com.nivi.test;

public class Hexagon {
    public static double countHexagonS (double a) {
        return TriangleSquare.countS(a, a, a) * 6;
    }
}
