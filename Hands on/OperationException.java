package Collection;

/* 
 Write a program that takes two numbers and an operator (+, -, *, /) from the user. 
 Perform the corresponding arithmetic operation and display the result. Handle exceptions for 
 invalid operators and division by zero.
*/

import java.util.*;
public class OperationException 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

	    System.out.print("Enter the first number: ");
	    int num1 = sc.nextInt();

	    System.out.print("Enter the second number: ");
	    int num2 = sc.nextInt();
	    
	    System.out.print("Enter the operator (+, -, *, /)"); 
	    char operator = sc.next().charAt(0);
	    
        //input for operation
	    int result;
	    
	    try
	    {
	    	switch (operator) 
	    	{
	    	case '+':
	    		result = num1 + num2;
	    		System.out.println("The result of addition is: " + result);
	    	break;
	    	
	    	case '-':
	    		result = num1 - num2;
	    		System.out.println("The result of subtraction is: " + result);
	    	break;
	    	
	    	case '*':
	    		result = num1 * num2;
	    		System.out.println("The result of multiplication is: " + result);
	    	break;
        
	    	case '/':
	    		result = num1 / num2;
	    		System.out.println("The result of division is: " + result);
	    	break;
	    	
	    	default:
	    		System.out.println("Error: Invalid operation number.");
	    	break;
	    	
	    	}

	    }
	    
	    catch (ArithmeticException e)
	    {
	    	System.out.println("An exception occurred: " + e.getMessage());
	    } 
	    
	    sc.close();
	}
}