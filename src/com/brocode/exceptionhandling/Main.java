package com.brocode.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Enter a number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a number to be divide it by: ");
            int y = scanner.nextInt();


            int res = x / y;
            System.out.println("The result is "+res);
        } catch (ArithmeticException e) {
            System.out.println("Throws an arithmetic exception");
        } catch (InputMismatchException e) {
            System.out.println("Input mismatch");
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            scanner.close();
        }


    }
}
