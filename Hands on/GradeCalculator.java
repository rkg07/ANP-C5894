package Loops;

/*Prompt the user to enter a numerical grade (0-100).
 Use a switch case statement to determine the corresponding letter grade based on the following scale:
 90-100: A
 80-89: B
 70-79: C
 60-69: D
 0-59: F
 Display the letter grade to the user.
 Handle input validation to ensure the grade is within the valid range.
 */

import java.util.Scanner;
public class GradeCalculator 
{
	public static void main(String[] args)
	{
		//input from the user
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your numeric grade :");
		
		int marks=sc.nextInt();
		String grade=null;
		
		if(marks>0 && marks<100)
		{
			System.out.println("Please enter a valide grade between 0 and 100");
			
			switch(marks/10)
			{
			
			case 10:
			case 9:
				grade="A";
				break;
				 
			case 8:
				grade="B";
				break;
				 
			case 7:
				grade="C";
				 break;
				 
			case 6:
				grade="D";
				 break;
				 
			case 5:
				grade="F";
				 break;
		 }
		}
		else {
			System.out.println ("The enter value is invalide :");
			
		}
	
			System.out.println("The grade is: "+ grade);
		sc.close();
	}
}