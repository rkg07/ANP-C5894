package Operator;

/*
 Write a Java program that takes an integer as user input 
 and checks if it is a positive number.
 */

import java.util.Scanner;
public class PositiveInteger 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        
        //input for the 1st number
        int num = sc.nextInt();
        
        if(num>0)
        {
        	System.out.println("The entered number is positive");
        	
        	boolean isnumber = num>0;
        	System.out.println(isnumber);
        }
        else 
        {
        	System.out.println("The entered number is not positive");
        }
		sc.close();
	}

}
