package com.company;

import java.util.Scanner;

// This is Rolling Dice
public class RollingDice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To the Paradise Roller Application \n");
        System.out.print("Roll the Dice? Continue(y/n) : ");
        String a = null;

        a = input.next();
        int dice1 = (int) (Math.random() * 6 + 1);
        int dice2 = (int) (Math.random() * 6 + 1);

            while (a.equalsIgnoreCase("y")) {
            System.out.print("Roll again? Continue(y/n) : ");
            a = input.next();

            if (dice1 == 6 && dice2 == 6) {
                System.out.println("Box Cars!");
            } else if (dice1 == 1 && dice2 == 1) {
                System.out.println("Snake Eyes!");
            } else {
                System.out.println("Craps!");
            }
        }
            if (a.equalsIgnoreCase("n")) {
                return;

            } else {
                System.out.print("Invalid");
            }
        }
    }
