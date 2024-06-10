package com.elias;

import java.util.Scanner;

/**
 * An Implementation of FizzBuzz
 * date: 06/10/2024
 * @author Elias Khatoun
 */

public class FizzBuzz {

    /**
     * Main method accepts a number from the user and prints Fizz, Buzz, or FizzBuzz depending on the number
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number greater than 1: ");
        int number = scanner.nextInt();
        validateInput(number);
        fizzBuzz(number);
    }


    /**
     * Validates the input number
     * @param number The number inputted by the user to validate
     */
    public static void validateInput(int number) {
        if (number < 1) {
            System.out.println("Number must be greater than 1");
            System.exit(1);
        }
    }

    /**
     * Algorithm that Prints Fizz, Buzz, or FizzBuzz depending on the number
     * @param number The number inputted by the user in the Main Method
     */
    public static void fizzBuzz(int number) {
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}