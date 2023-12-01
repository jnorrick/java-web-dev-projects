package org.launchcode;

import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        double radius;
        Scanner input;
        double pi = 3.14;

        input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle ");
        radius = input.nextDouble();
        input.close();

        double area = (pi * radius) * 2;
        System.out.println();

    }

}
