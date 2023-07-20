package Loops;

/*Prompt the user to enter a temperature in Celsius.
Provide a menu to choose the conversion type: Fahrenheit, Kelvin, or Rankine.
Use a switch case statement to perform the selected conversion and display the result.
Handle invalid conversion choices appropriately.
 */

import java.util.Scanner;
public class TemperatureConversion 
{
	public static void main(String[] args)
	{
		//input from the user
			Scanner sc=new Scanner(System.in);
			System.out.println("Welcome to Temperature Conversion Appp!");
		    System.out.println("-------------------------------");
			System.out.print("Enter a temperature in celsius: "    );
			int c=sc.nextInt();
		       
		//double result;
			System.out.println("Available conversion:");
	        System.out.println("1. Fahrenheit");
	        System.out.println("2. Kelvin");
	        System.out.println("3. Rakine");
	        System.out.print("Enter the operation number: ");

	        int temp = sc.nextInt();
		    double result;

			switch (temp)
		{
			case 1:
				result = ((9*c)/5 + 32);
			    System.out.println("Temperature in Fahrenheit: " + result + "F");
                break;
				
			case 2:
				result = c + 273.15;
				System.out.println("Temperature in Kelvin: " + result + "K");
	            break;
				
			case 3:
				result = ((c*9)/5 + 491.67);
				System.out.println("Temperature in Rakine: " + result + "R");
	            break;
				
			default:
				System.out.println("Invalid conversion choices ");
				break;
		}
				sc.close();
				
    }
}