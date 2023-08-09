package Array;

/*
 Write a Java program to take an 15  array of integers as input from the user 
 and sort it in ascending order using any suitable sorting algorithm. 
 Display the sorted array.
 */

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortAscending 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		// Step 1: Get the size of the array from the user
        int size = 15; 

        // Step 2: Get the elements of the array from the user
        int[] arr = new int[size];
        
        System.out.println("Enter " + size + " elements:");
       
        for (int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        // Step 3: Sort the array in ascending order
        Arrays.sort(arr);
        
        System.out.print("Array in ascending order: ");
        printArray(arr);
        
        sc.close();
	}
	
	private static void printArray(int[] arr) 
	{
		for (int i = 0; i < arr.length; i++) 
		{
            System.out.print(arr[i] + " ");
        }
		System.out.println();
	}

}