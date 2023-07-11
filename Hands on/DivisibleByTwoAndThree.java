package Loops;

/*Write a Java program that takes an integer as input 
and checks if it is divisible by 2, 3, or both. 
Print "Divisible by 2" if it is divisible by 2, 
"Divisible by 3" if it is divisible by 3, 
and "Divisible by both 2 and 3" if it is divisible by both
 */

import java.util.Scanner;

public class DivisibleByTwoAndThree 
{
  public static void main(String[] args)
  {
      // Create a Scanner object to read input from the user
      Scanner scanner = new Scanner(System.in);

      // Prompt the user to enter an integer
      System.out.print("Enter an integer: ");
      int number = scanner.nextInt();

      // Check if the number is divisible by 2 and/or 3
      if (number % 2 == 0 && number % 3 == 0) 
      {
          System.out.println("Divisible by both 2 and 3");
      } 
      else if (number % 2 == 0)
      {
          System.out.println("Divisible by 2");
      } else if (number % 3 == 0) 
      {
          System.out.println("Divisible by 3");
      } 
      else 
      {
          System.out.println("Not divisible by 2 or 3");
      }

      // Close the scanner
      scanner.close();
  }
}