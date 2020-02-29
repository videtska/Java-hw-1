package com.nivi.test;

import static com.nivi.test.IsTriangle.*;

public class TriangleSquare {
    public static double countS (double a, double b, double c) {
        double s = -1;
        if (checkSides(a,b,c)) {
            double p = (a + b + c) / 2;
            s = Math.sqrt((p * (p - a) * (p - b) * (p - c)));
        }
        return s;
    }
}
