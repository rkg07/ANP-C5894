package Collection;

/*
 Write a program that attempts to divide two numbers. Whether the division is successful 
 or not, make sure to display a "Division completed" message. Ensure that 
 the division operation is performed in a try block 
 and the "Division completed" message is displayed in a finally block.
 */

import java.util.Scanner; 
public class Divide
{

	public static void main(String[] args)
	{
		//Scanner class to take input from user
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numerator: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the denominator: ");
		int num2 = sc.nextInt();
		
		//using try,catch and finally
		try 
		{
			//Declaring and Initializing variable result to calculate division.
			int result = num1 / num2;
	
			//prints the division of number
			System.out.println("The Division of Number is: " + result);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Error!: "+e.getMessage());
		}
		
		finally
		{
			//Display the division completed message
			System.out.println("Division completed");
		}
	
		//closing the scanner class object
		sc.close();
	}
	

}
