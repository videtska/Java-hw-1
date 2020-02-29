package com.nivi.test;

public class DistanceBetweenDots {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        double dist;
        dist = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        return dist;
    }
}
