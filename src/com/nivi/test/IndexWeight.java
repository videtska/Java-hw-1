package com.nivi.test;

import java.text.DecimalFormat;

public class IndexWeight {
    public static double checkIndex(double height, double weight) {
        double ind;
        ind = weight / Math.pow(height, 2);
        return Double.parseDouble((new DecimalFormat("##.##").format(ind)));
    }
}
