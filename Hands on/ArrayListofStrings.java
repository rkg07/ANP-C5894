package Array;
/*
 Create an ArrayList of strings and add the following elements: 
 "Apple", "Banana", "Orange", "Mango", "Grapes". 
 Display the elements of the ArrayList.
 */

import java.util.ArrayList;
import java.util.List;
public class ArrayListofStrings 
{

	public static void main(String[] args) 
	{
		List < String > fruits = new ArrayList <> ();
		fruits.add(" Apple");
		fruits.add(" Banana");
		fruits.add(" Orange");
		fruits.add(" Mango");
		fruits.add(" Grapes ");
		
		System.out.println("Fruits list: " +fruits);
		
	}

}

