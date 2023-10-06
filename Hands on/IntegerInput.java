package Collection;

/*
 Write a Java program that reads an integer from the user using the Scanner class. 
 Handle the InputMismatchException that can occur if the user enters a non-integer value.
 Display an appropriate error message.
*/

import java.util.*;
public class IntegerInput 
{
	public static void main(String[] args)
	{
		//scanner class
		Scanner sc = new Scanner(System.in);
		
		try
		{
	        //print the enter number
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt(); // This line can throw NumberFormatException
	       
	        //Display the number that the user entered.
	        System.out.println("You entered: " + number);
	        
		}
		
		//Catch block InputMismatch Exception to handle if the user enters a non-integer value. 
	    catch (InputMismatchException e)
		{
	    	//Print the message if the number is non integer
	    	System.out.println("Invalid input. Please enter a valid number.");
	    	
		}
		//Closing the Scanner class object
		sc.close();  
	        
	}
	
}