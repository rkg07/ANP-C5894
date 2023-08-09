package Operator;

//Bitwise operation example
import java.util.Scanner;

public class BitwiseOperatorsExample 
{
  public static void main(String[] args) 
  {
      Scanner scanner = new Scanner(System.in);

      // Input first integer
      System.out.print("Enter the first integer: ");
      int num1 = scanner.nextInt();

      // Input second integer
      System.out.print("Enter the second integer: ");
      int num2 = scanner.nextInt();

      // Bitwise AND
      int bitwiseAndResult = num1 & num2;
      System.out.println("Bitwise AND Result: " + bitwiseAndResult);

      // Bitwise OR
      int bitwiseOrResult = num1 | num2;
      System.out.println("Bitwise OR Result: " + bitwiseOrResult);

      // Bitwise XOR
      int bitwiseXorResult = num1 ^ num2;
      System.out.println("Bitwise XOR Result: " + bitwiseXorResult);

      // Bitwise Complement (Unary NOT)
      int bitwiseComplementResult1 = ~num1;
      System.out.println("Bitwise Complement of first integer: " + bitwiseComplementResult1);

      int bitwiseComplementResult2 = ~num2;
      System.out.println("Bitwise Complement of second integer: " + bitwiseComplementResult2);

      scanner.close();
  }
}