package Loops; 

/*Write a Java program that takes a year as input 
and checks if it is a leap year. 
If the year is divisible by 4, check if it is also divisible by 100. 
If it is divisible by 100, check if it is also divisible by 400. 
Print "Leap Year" if it satisfies all the conditions, 
and "Not a Leap Year" otherwise.
 */

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) 
		{
			Scanner y=new Scanner(System.in);
			System.out.println("Enter a value:");
			
			int k=y.nextInt();
			
			if(k%4==0)
			{
				System.out.println("Leap year");

			}
			else if(k%100==0) 
			{
				System.out.println("Leap Year");
			}
			else if(k%400==0)
			{
				System.out.println("Leap Year");
			}
			else
			{
				System.out.println("Not a leap year");
			}
			y.close();


		}

	}