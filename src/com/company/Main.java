package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int secretNumber, guessCount, guess = 0;//guess is initialized to 0

        secretNumber = 123;

        System.out.println("I'm thinking of a number between 1 and 1000");
        System.out.print("Enter the number:");
        guess = keyboard.nextInt();
//        guessCount = 4;

        while ( guess != secretNumber )
        {
            if (guess == 5){
                break;
            }
            System.out.println("\nYou are wrong. Try again.");
            System.out.println("Enter the number: ");
            guess = keyboard.nextInt();

        }


            System.out.println("You are correct. You win a prize!");
        keyboard.close();



//        while ( guess != secretNumber )
//        {
//            System.out.println("\nYou are wrong. You have " + guessCount + " left. Try again.");
//            System.out.println("Enter the number: ");
//            guess = keyboard.nextInt();
//            guessCount--;
//            if (guessCount == 0){
//                System.out.println("You Lose!");
//                break;
//
//            }
//
//        }
//
//
//        if (guess == secretNumber){
//            System.out.println("You are correct. You win a prize!");
//        }
//        keyboard.close();
    }
}
