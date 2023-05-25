/*

Explanation of the logic:

- We start by obtaining the input number from the user.
- We first check if the number is less than 2, as prime numbers are defined as numbers greater than 1. If the number is less than 2, we print that it's not a prime number and exit the program.
- If the number is greater than or equal to 2, we iterate from 2 up to the square root of the number.
- We use the Math.sqrt() method to calculate the square root of the number.
    - If the number is divisible by any integer in this range, it means it has divisors other than 1 and itself, so it's not a prime number. We print that it's not prime and exit the program.
    - If the loop completes without finding any divisor, it means the number is only divisible by 1 and itself, making it a prime number. We print that it's a prime number.
- This code efficiently checks for primality by only iterating up to the square root of the number.
 */


package com.mathprobs.primeornot;

import java.util.Scanner;

public class EfficientCheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        if (number < 2) {
            System.out.println(" is not a prime number");
            return;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                System.out.println(number + " is not a prime number");
                return;
            }
        }

        System.out.println(number + " is a prime number");

    }
}
