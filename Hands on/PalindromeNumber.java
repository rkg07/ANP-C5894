package Operator;
/*
 Write a Java program that prompts the user to enter a three-digit number.
 The program should check if the number is a palindrome, 
 which means it reads the same forwards and backwards.
 */

import java.util.Scanner;

public class PalindromeNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a three-digit number: ");
        int number = sc.nextInt();

        // Extracting the digits
        int firstDigit = number / 100;
        int thirdDigit = number % 10;

        // Checking if it's a palindrome
        if (firstDigit == thirdDigit) 
        {
            System.out.println("The number is a palindrome.");
        } else 
        {
            System.out.println("The number is not a palindrome.");
        }
        sc.close();
    }
}