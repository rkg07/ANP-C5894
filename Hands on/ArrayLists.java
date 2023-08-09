package Array;

/*
 ArrayList Operations
 Write a Java program that demonstrates the following operations using an ArrayList:
 a) Adding elements to the list.
 b) Removing an element from the list.
 c) Updating an element in the list.
 d) Displaying the contents of the list.
 */
import java.util.ArrayList;
import java.util.List;
public class ArrayLists 
{

	public static void main(String[] args) 
	{
		//creat list of elements
		 List<Integer> i=new ArrayList<>();
		 
		 i.add(10);
		 i.add(20);
		 i.add(30);
		 i.add(40);
		 i.add(50);
		 
		//printing the elements
		 System.out.println("List: " + i);
		 
		 //Removing an element from the list.
		 i.remove(2);
		 System.out.println("List after removing element at index 2: " +i);
		 
		 //Updating an element in the list.
		 i.add(3,60);
		 System.out.println("Updated List: " +i);
		 
		 //Displaying the contents of the list
		 System.out.println("Number list: " + i);
		 

	}

}
