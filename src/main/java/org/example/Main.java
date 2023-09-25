package org.example;

import java.awt.geom.Point2D;

public class Main {
    public static void main(String[] args) {
        System.out.println("Calculating distance between points.");

    }

    public static double calculateDistanceBetweenPointsWithPoint2D(
            double x1,
            double y1,
            double x2,
            double y2) {

        return Point2D.distance(x1, y1, x2, y2);
    }
}