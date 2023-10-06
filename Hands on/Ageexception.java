package Collection;

/*
 Develop a program that takes a user's age as input and determines 
 if they are eligible to vote (age >= 18). If the user enters non-numeric text 
 or a negative number, catch the NumberFormatException and
 IllegalArgumentException respectively, displaying appropriate error messages.
*/

import java.util.Scanner;
public class Ageexception 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	    
	    try 
	    {
	    	System.out.print("Enter a age: ");
            int num1 = Integer.parseInt(sc.nextLine()); 
	    	
            if(num1>=18)
	    	{
	    		System.out.println("You are eligible to vote.");
	    	}
	    	
            else 
	    	{
	    		System.out.println("You are not eligible to vote.");
	    	}
	    }
	    
	    catch (NumberFormatException e)
        {
            System.out.println("Error: Please enter a valid numeric age.");
        }   
	    
        sc.close(); 
	}
}