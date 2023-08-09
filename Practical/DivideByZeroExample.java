package Collection;

//DivideByZeroException example
import java.util.Scanner;
public class DivideByZeroExample
{
	 public static void main(String[] args) 
	  {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Enter the numerator: ");
	    int numerator = sc.nextInt();

	    System.out.print("Enter the denominator: ");
	    int denominator = sc.nextInt();

	    try 
	    {
	            int result = numerator / denominator;
	            System.out.println("Result: " + result);
	    }
	    catch (ArithmeticException e)
	    {
	            System.out.println("An exception occurred: " + e.getMessage());
	    } 
	    sc.close();
	  }
}