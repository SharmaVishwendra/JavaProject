package com.company;

import java.util.Scanner;

public class TravelTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int miles,Hours,minutes;
        String a = null;

        System.out.println("Welcome To the Travel Time Calculator \n");

        System.out.print("Enter miles : ");
        miles = input.nextInt();

        System.out.print("Enter miles per hour : ");
        minutes = input.nextInt();

        Hours = miles/minutes;

        System.out.print("Estimated Travel Time : " + Hours + "\n");

        System.out.println("Continue (y/n) : ");

        a = input.next();

        while (a.equalsIgnoreCase("y")) {

            System.out.print("Enter miles : ");
            miles = input.nextInt();

            System.out.print("Enter miles per hour : ");
            minutes = input.nextInt();

            Hours = miles/minutes;

            System.out.print("Estimated Travel Time : " + Hours);

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
