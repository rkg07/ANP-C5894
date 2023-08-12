package Collection;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionExample 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter elements for the array:");
      
        for (int i = 0; i < size; i++) 
        {
            System.out.print("Element " + i + ": ");
            array[i] = sc.nextInt();
        }

        System.out.print("Enter an index to retrieve an element: ");
        int index = sc.nextInt();

        try 
        {
            int element = array[index];
            System.out.println("Element at index " + index + ": " + element);
        } 
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error: Array index out of bounds!");
        }
        sc.close();
    }
}