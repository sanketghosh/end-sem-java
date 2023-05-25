/*

Explanation of the logic:

- We start by obtaining the input number from the user.

- We calculate the number of digits in the given number using the String.valueOf() method to convert the number to a string and then finding its length. This will help us later to compute the sum of the cubes of each digit.

- We create a temporary variable temp and initialize it with the original number.

- We initialize the sum variable to 0. This variable will hold the sum of the cubes of each digit.

- We enter a loop that continues until the temp variable becomes 0.

    - Inside the loop, we extract the rightmost digit (remainder) from temp using the modulus operator %.
    - We add the cube of the extracted digit to the sum variable using the Math.pow() method.
    - We update the temp variable by removing the rightmost digit (integer division by 10).

- After the loop ends, we check if the sum is equal to the original number. If they are equal, it means the number is an Armstrong number.

    - If the sum is equal to the original number, we print that it's an Armstrong number.
    - If the sum is not equal to the original number, we print that it's not an Armstrong number.

 */


package com.mathprobs.armstrongcheck;

import java.util.Scanner;

public class CheckArmstrong {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = scanner.nextInt();

        // Calculate the number of digits in the given number
        int numberOfDigits = String.valueOf(number).length();
//        System.out.println(numberOfDigits);

        // Create a temporary variable to store the original number
        int temp = number;

        // Initialize sum to 0
        int sum = 0;

        // Calculate the sum of the cubes of each digit

        while (temp > 0) {
            int reminder = temp % 10;
            System.out.println("Reminder: "+reminder);
            System.out.println("The sum before adding: "+sum);
            sum += Math.pow(reminder, numberOfDigits);
            System.out.println("The sum: "+sum);
            temp /= 10;
            System.out.println("The Temp val: "+temp);
        }

        // Check if the sum is equal to the original number

        if (sum == number) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }
    }
}
