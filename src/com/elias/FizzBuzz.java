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
        // Create a scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number greater than 1: ");
        int number = scanner.nextInt();
        // Validate the input number is greater than 1
        validateInput(number);
        // Call the fizzBuzz method
        fizzBuzz(number);
        
        // Close the scanner
        scanner.close();
    }


    /**
     * Validates the input number
     * @param number The number inputted by the user to validate
     */
    public static void validateInput(int number) {
        if (number < 1) {
            System.out.println("Number must be greater than 1");
            // Exit the program
            System.exit(1);
        }
    }


    /**
     * Algorithm that Prints Fizz, Buzz, or FizzBuzz depending on the number
     * @param number The number inputted by the user in the Main Method
     */
    public static void fizzBuzz(int number) {
        // Loop through the numbers from 1 to the inputted number
        for (int i = 1; i <= number; i++) {
            // Check if the number is divisible by 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            // Check if the number is divisible by 3
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            // Check if the number is divisible by 5
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            // Print the number if it is not divisible by 3 or 5
            } else {
                System.out.println(i);
            }
        }
    }
}