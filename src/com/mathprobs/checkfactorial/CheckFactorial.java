/*
Explanation of the logic:

- We define a class called FactorialCalculator to encapsulate the factorial calculation logic.
- The calculateFactorial method takes an integer number as input and returns its factorial.
- At the beginning of the method, we check if the number is negative. Since factorial is not defined for negative numbers, we throw an IllegalArgumentException with an appropriate error message.
- We initialize a variable factorial to 1. This variable will hold the calculated factorial.
- Using a for loop, we iterate from 1 to the given number.
- Inside the loop, we multiply the current value of factorial with the iteration number i and update factorial with the result.
- After the loop completes, the factorial variable will hold the factorial of the given number.
- Finally, we return the factorial value.
- In the main method, we call the calculateFactorial method with a sample number (5 in this case) and store the result in the factorial variable.
- We print the result to the console, along with a message indicating the input number and its factorial.

 */


package com.mathprobs.checkfactorial;

import java.util.Scanner;

public class CheckFactorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int factorial_result = calculate_factorial(number);
        System.out.println("The factorial of " + number + " is " + factorial_result);
    }

    public static int calculate_factorial(int number) {

        //check if the number is negative
        if (number < 0) {
            System.out.println("Cannot calculate the factorial");
        }

//        initialize the result variable
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            // Multiply the current factorial with the iteration number
            factorial *= i;
        }

        // return the factorial
        return factorial;
    }
}
