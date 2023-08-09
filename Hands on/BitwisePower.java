package Operator;
/*
 Write a Java program that takes an integer input from the user 
 and checks if it is a power of 2 using bitwise operators. 
 Print "Yes" if it is a power of 2, and "No" otherwise.
 */

import java.util.Scanner;
public class BitwisePower 
{

	public static void main(String[] args) 
	{
		//Creat an object of scanner class
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a numbar :");
		
		//input the 1st number 
		int num= sc.nextInt();
		
		//using if else loop and '&' operator
		if ((num &(num -1))==0)
		{
			System.out.println("Given Number is Power of 2");
			
		}
		
		else 
		{
			System.out.println("Given Number is Not Power of 2");
			
		}		
		sc.close();
		
	}

}
