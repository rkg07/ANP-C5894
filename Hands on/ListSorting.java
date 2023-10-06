package Collection;

/*
 List Sorting
 Write a Java program that sorts a list of strings in alphabetical order 
 using the Collections framework.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class ListSorting 
{
	public static void main(String[] args) 
	{
		//Creating list of Strings
		List<String> s = new ArrayList<>();
	        
		//Adding the elements in an ArrayList
		s.add("Kiwi");
	    s.add("Mango");
	    s.add("Orange");
	    s.add("Grapes");
	    s.add("Apple");
	    
	    //Accessing elements in the list
	    System.out.println("List before sorting:"+s);
	  
	    //Sorting a list of strings in alphabetical order using the Collections framework
	    Collections.sort(s);
	  
	    //Printing the list After sorted
	    System.out.println("List after sorting:"+s);
	
	}
	
}
