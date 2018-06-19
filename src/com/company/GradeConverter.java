package com.company;

import java.util.Scanner;

public class GradeConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int grade = 0;
        String a = null;
        int A, B, C, D, F;

        System.out.println("Welcome To the Letter Grade Converter \n");


        System.out.print("Enter Numerical grade : ");
        grade = input.nextInt();

        if (grade >= 81 && grade <= 100) {
            System.out.println("Letter Grade : A");
        } else if (grade >= 71 && grade <= 80) {
            System.out.println("Letter Grade : B");
        } else if (grade >= 61 && grade <= 70) {
            System.out.println("Letter Grade : C");
        } else if (grade >= 0 && grade <= 60) {
            System.out.println("Letter Grade : F");
        }
        System.out.println("Continue (y/n) : ");

        a = input.next();

        while (a.equalsIgnoreCase("y")) {
            System.out.print("Enter Numerical grade : ");
            grade = input.nextInt();

            if (grade >= 81 && grade <= 100) {
                System.out.println("Letter Grade : A");
            } else if (grade >= 71 && grade <= 80) {
                System.out.println("Letter Grade : B");
            } else if (grade >= 61 && grade <= 70) {
                System.out.println("Letter Grade : C");
            } else if (grade >= 0 && grade <= 60) {
                System.out.println("Letter Grade : F");
            }
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
