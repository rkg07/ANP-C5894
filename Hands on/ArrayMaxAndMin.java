package Array;

/* 
 Given an array of integers, write a Java program to find 
 the maximum and minimum elements in the array.
 */

import java.util.Scanner;
public class ArrayMaxAndMin
{
	public static void main(String[] args) 
	{
		//Scanner class object
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int[]num = new int [size];
		
		System.out.println("Enter " + size + "integers: ");
		int i;
		
		// Initializing and Declaring the value
		for (i=0; i<size; i++)
		{
			num[i] = sc.nextInt();
			
		}
		
		// Declare and initialize variables to store the maximum and minimum elements
		int min = num[0];
		int max = num[0];
		
		for (i=0; i<size; i++)
		{
			// Using if else loop
			if(num[i]>max)
			{
				max = num[i];
			}
			
			if(num[i]< min)
			{
				min = num[i];
			}
		}
		//Display the maximum and minimum elements
		System.out.println("Maximun Number: " + max);
		System.out.println("Minimum Number: " + min);
		
		sc.close();

	}

}
