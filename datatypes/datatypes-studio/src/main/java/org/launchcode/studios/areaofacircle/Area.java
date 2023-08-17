package org.launchcode.studios.areaofacircle;

import java.util.Scanner;
public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius");
        double radius = input.nextDouble();
        Circle.getArea(Double radius);
        System.out.println(String.format("The area of a circle of radius %s is %s", radius, area));
    }
}
