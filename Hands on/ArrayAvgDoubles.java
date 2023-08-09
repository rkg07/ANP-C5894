package Array;

/*
 * Write a Java program to find the average of all elements in an array of doubles.
 */

import java.util.Scanner;
public class ArrayAvgDoubles 
{

	public static void main(String[] args) 
	{
		//scanner class object
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the siza of the array: ");
		double size = sc.nextInt();
		
		double [] num = new double[(int)size];
		
		System.out.println("Enter " + size +"integers:");
		
		//initializing and declaring the values
		for(double i=0; i < size; i++)
		{
			num[(int)i]=sc.nextInt();
		}
		
		//display the elements
		System.out.print("Element in the array: ");
		
		for(double i=0;i<size;i++)
		{
			System.out.print(num[(int)i]+" ");
		}
		
		//calculating  the average of arrays
		int sum=0;
		float avg = 0;
		
		for (int i=0;i<size;i++)
		{
			sum =(int)(sum+num[i]);
			avg =(float)(sum/size);
			
			System.out.println(" ");
		}
		
		//display the average values
		System.out.print("Average of arrays is: " + avg);
		
		sc.close();
		
	}

}
