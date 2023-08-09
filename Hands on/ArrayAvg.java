package Array;

/*
Array Average
Write a program that takes the size of the array as input from the user. 
Then, prompt the user to enter elements of the array. 
Calculate and display the average of all elements in the array.
*/


import java.util.Scanner;
//single dimensional array example
public class ArrayAvg {

	public static void main(String[] args) 
	{
		//scanner class object
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter the size of the array: ");
       int size = sc.nextInt();
       
       int[] numbers = new int[size]; 
     
       System.out.println("Enter " + size + " integers:");
     //initializing and declaring the values
       for (int i = 0; i < size; i++)
       {
           numbers[i] = sc.nextInt();
       }
     //displaying the elements
       System.out.print("Elements in the array:");
       for (int i = 0; i < size; i++)
       {
           System.out.print(numbers[i] + " ");
       }

       
       //calculating the average of arrays
       int sum=0;
       float avg=0;
       for (int i = 0; i < size; i++)
       {
       	sum = sum+numbers[i];
       	avg = sum/size;
       	System.out.println(" ");
       }
     //displaying the average values
       System.out.print("Avg of arrays is: " + avg);
       
       sc.close();

	}

}