package Loops; 

import java.util.Scanner;

public class Nestedif {

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


		}

	}