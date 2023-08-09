package Array;

//Minimum & Maximum number
import java.util.Scanner;
public class MinMaxFinder 
{
  public static void main(String[] args) 
  {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the number of elements: ");
      int n = sc.nextInt();

      int[] array = new int[n];

      System.out.println("Enter the elements:");
      for (int i = 0; i < n; i++) {
          array[i] = sc.nextInt();
      }

      sc.close();

      int min = array[0];
      int max = array[0];

      for (int num : array) {
          if (num < min) {
              min = num;
          }
          if (num > max) {
              max = num;
          }
      }

      System.out.println("Array elements: " + java.util.Arrays.toString(array));
      System.out.println("Minimum: " + min);
      System.out.println("Maximum: " + max);
  
  }
  
}