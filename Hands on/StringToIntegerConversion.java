package Collection;

/*
 Write  a Java program that reads a string input from the user. 
 Convert the string to an integer using the Integer.parseInt() method.
 Handle the NumberFormatException that can occur if the input cannot be parsed as an integer. 
 Display a message indicating that the input is not a valid integer.
*/

import java.util.*;
public class StringToIntegerConversion 
{
	public static void main(String[] args) 
	{
		//Creating Scanner class object  to take input from the user
		Scanner sc = new Scanner(System.in);
		//Prompts to user to enter an integer as string
		System.out.print("Enter a string: ");
		
		//String input for variable input
		String input = sc.nextLine();
		
		//Try block contains a code that convert the input to an integer.
		try 
        {
            int number = Integer.parseInt(input); // This line can throw NumberFormatException
            //Printing the message if the String is converted.
            System.out.println("The converted integer value is: " + number);
        
        } 
		
		//Catch block NumberFormat exception if input cannot be converted to an integer.
        catch (NumberFormatException e)
        {
        	//Printing the message if the input is not a valid integer
        	System.out.println("Input is not a valid integer.");
        }   
		//Closing the Scanner class object.
        sc.close();       
         
	}

}

