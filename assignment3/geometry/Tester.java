package com.sunbeam.Assignments.assignment3.geometry;

import com.app.geometry.Point2D;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x and y for Point 1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.println("Enter x and y for Point 2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        com.app.geometry.Point2D p1 = new com.app.geometry.Point2D(x1, y1);

        com.app.geometry.Point2D p2 = new Point2D(x2, y2);
        System.out.println("Point 1: "+p1.getDetails());
        System.out.println("Point 2: "+p2.getDetails());
        if (p1.isEqual(p2)){
            System.out.println("Both points in same direction !!");
        }
        else{
            System.out.println("Points are different");
            System.out.println("Distance between p1 and p2: "+p1.calculateDistance(p2));
        }

    }
}
