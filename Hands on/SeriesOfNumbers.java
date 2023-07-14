package Loops;
 /*
  Write a Java program that asks the user to enter a series of numbers (positive or negative) 
  and calculates their sum. The program should stop asking for input when the user enters 0. 
  Use a do-while loop to continuously ask for numbers and keep adding them to the sum.
  */

import java.util.Scanner;
public class SeriesOfNumbers 
{

	public static void main(String[] args) 
	{
		//scanner class object
        Scanner sc = new Scanner(System.in);
        
       //variable declaration
        int number;
        int sum=0;
               
       //do loop 
        do 
        {
        	System.out.println("Enter a numbar:");
        
        	//user input
        	number = sc.nextInt();
        	sum+=number;
        }
         
        //Test expression 
        while (number !=0);
        
        System.out.println("sum of number is" +sum );
        sc.close();
        
	}
}        	