package Loops;

/*Write a Java program that takes an integer as input 
and checks if it is divisible by 5 and 11. 
Print "Divisible" if it is divisible by both, 
and "Not Divisible" otherwise
 */
import java.util.Scanner;

public class IfElse2 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value:");
		
		int k=s.nextInt();
		
		if(k%5==0 && k%11==0)
		{
			System.out.println("Number is divisible by 5 and 11");

		}
		else 
		{
			System.out.println("Number is not divisble by 5 and 11");
		}
		s.close();

	}

}