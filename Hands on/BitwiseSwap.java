package Operator;

/*
 Write a Java program that takes two integer inputs from the user
 and swaps their values using bitwise operators. 
 After swapping, print the updated values of the two integers.
 */
import java.util.Scanner;
public class BitwiseSwap 
{

	public static void main(String[] args) 
	{
		//Creat an object of scanner class
		Scanner sc= new Scanner(System.in);
		
		//Input first integer
		System.out.print("Enter the first integer: ");
		int num1=sc.nextInt();
		
		//Input second integer
		System.out.print("Enter the second integer:");
		int num2 =sc.nextInt();
		
		System.out.println("Before Swapping");
		//Before Swapping 
		System.out.println("num1=" + num1 + "num2 ="+num2);
		
		num1=num1^num2;
		num2=num1^num2;
		num1=num1^num2;
		
		System.out.println("After Swapping");
		//After swapping
		System.out.println("num1=" + num1 + "num2 ="+num2);
		
		sc.close();

	}

}
