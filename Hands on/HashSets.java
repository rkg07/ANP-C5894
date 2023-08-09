package Collection;
/*HashSet Operations
 Create a program that showcases the usage of a HashSet:
 a) Add elements to the set.
 b) Check whether a specific element exists in the set.
 c) Remove an element from the set.
 d) Print the elements of the set.
 */

import java.util.*;
public class HashSets 
{

	public static void main(String[] args)
	{
		Set<String> s=new HashSet<>();
		
		s.add("CSMT");
		s.add("Dadar");
		s.add("Bhandup");
		s.add("Mulund");
		s.add("Airoli");
		
		//printing the elements
		System.out.println("Elements are: " +s);
		
		String a="Mulund";
		//check whether the string is available or not
		System.out.println("Elements Contains: " +a+ " " +s.contains(a));
		
		//Removing an element from the list.
		s.remove("Airoli");
		System.out.println("List after removing element at index 4: " +s);
		 
		//Displaying the contents of the list
		System.out.println("Number list: " + s);
		
	}

}
