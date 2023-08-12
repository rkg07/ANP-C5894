package Collection;

/*
 Write a program that takes an integer input from the user 
 and throws this custom exception if the input is negative.
 Catch the exception and display an error message accordingly. 
*/

import java.util.Scanner; 
public class TryInteger 
{

	public static void main(String[] args) 
	{
		//Scanner class to take input from user
		Scanner sc = new Scanner(System.in);

	    System.out.print("Enter the number: ");
	    int num = sc.nextInt();
	   	if(0>num) 
	   		
	    try
	   	{
	    	throw new Exception();
        }
	   	
	   	catch(Exception e)
	   	{
	    	//Displays the error message.
            System.out.println("Error occured");
        }
	   	
	   	else 
	   	{
	    	//prints if the number is positive
	   		System.out.println("Positive integer");
	   	}
	   	
	    //closing the scanner class object
        sc.close();

	}

}