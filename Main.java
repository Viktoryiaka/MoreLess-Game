package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input;

        double rand = Math.random()*200000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the game! A random number is generated. Please enter 'more' or 'less' to guess.");
        input = scanner.nextLine();

        if (input.equals("less") && rand <= 99999 && rand > 0)
            System.out.println("You won. The random number is " + rand);
        else if (input.equals("more") && rand > 99999 && rand <=200000)
            System.out.println("You won. The random number is " + rand);
        else
            System.out.println("You lost. The random number is " + rand);
    }
}