package org.launchcode;

import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        double radius;
        Scanner input;
        double pi = 3.14;
        String userInput;

        input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        radius = input.nextDouble();
        input.close();


        double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius "+ radius +" is: " + area);

    }

}
