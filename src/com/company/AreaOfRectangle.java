package com.company;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float Length, Width, Area, Perimeter;

        String a = null;

        System.out.println("Welcome To the Area And Perimeter Calculator \n");

        System.out.print("Enter Lemgth : ");
        Length = input.nextFloat();

        System.out.print("Enter Width : ");
        Width = input.nextFloat();

        Area = Length * Width;
        Perimeter = 2 * (Length + Width);

        // Area of the Reactangle

        System.out.println("Area : " + Area);

        // Perimeter of the Reactangle

        System.out.println("Perimeter : " + Perimeter);

        System.out.println("Continue (y/n) : ");

        a = input.next();

        while (a.equalsIgnoreCase("y")) {

            System.out.print("Enter Lemgth : ");
            Length = input.nextFloat();

            System.out.print("Enter Width : ");
            Width = input.nextFloat();

            Area = Length * Width;
            Perimeter = 2 * (Length + Width);

            // Area of the Reactangle

            System.out.println("Area : " + Area);

            // Perimeter of the Reactangle

            System.out.println("Perimeter : " + Perimeter);

            System.out.println("Continue (y/n) : ");

            a = input.next();

        }

        if (a.equalsIgnoreCase("n")) {
            return;
        } else {
            System.out.print("Invalid");
        }
    }
}
