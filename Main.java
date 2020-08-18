package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input;

        double rand = Math.random()*200000; // Можно поставить final, тк значение больше не будет меняться. 
        // В этом случае удобнее будет использовать new Random().nextInt(200_000 + 1); Генерирует целое число  от 1 до 200к. Основное отличие - возвращает «целое» число.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the game! A random number is generated. Please enter 'more' or 'less' to guess.");
        input = scanner.nextLine();

        if (input.equals("less") && rand <= 99999 && rand > 0) // Проверку rand > 0 можно убрать, у тебя рандомное число может быть только от 0 до 200_000, меньше нуля нет.
            System.out.println("You won. The random number is " + rand);
        else if (input.equals("more") && rand > 99999 && rand <=200000)
            System.out.println("You won. The random number is " + rand);
        else
            System.out.println("You lost. The random number is " + rand);
        
        /*
            И не забывай, что java - ооп язык. Играйся с объектами и тп. В данном случае более чем не критично, но когда пойдут более объемные проекты - загнешься. 
        */
    }
}
