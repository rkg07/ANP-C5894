package Collection;

/*
 In this example, the program prompts the user to enter a number.
 It then attempts to parse the user's input into an integer using Integer.
 parseInt(). If the user enters non-numeric text, the NumberFormatException 
 unchecked exception can occur.The try block contains the input and parsing operations.
 If a NumberFormatException occurs, the catch block catches the exception 
 and informs the user about the invalid input.
 */
import java.util.Scanner;

public class NumberFormatExceptionEx
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        try 
        {
            System.out.print("Enter a number: ");
            int number = Integer.parseInt(scanner.nextLine()); // This line can throw NumberFormatException
            System.out.println("You entered: " + number);
        } 
        catch (NumberFormatException e)
        {
            System.out.println("Invalid input. Please enter a valid number.");
        }   
        scanner.close();       
        System.out.println("Program continues...");
    }
}