package Collection;

/*
 Queue Operations
 Design a program that demonstrates the use of a Queue:
 a) Enqueue elements into the queue.
 b) Dequeue elements from the queue.
 c) Check whether the queue is empty.
 d) Print the elements in the queue.
*/
import java.util.*;
public class Queuee 
{

	public static void main(String[] args) 
	{
		Queue <String> q=new LinkedList<>();
		
		q.add("A");
		q.add("B");
		q.add("C");
		q.add("D");
		q.add("E");
		
		//display the elements of the queue
		System.out.println("Elements of queue:" +q);
		
		q.remove("C");
		System.out.println("Removed Element is:" +q);
		
		
		// Check if the queue is empty
	    System.out.println("Is queue empty? " + q.isEmpty());
	    
	    //Displaying the contents of the queue
	    System.out.println("Number list: " + q);
		
		
	}

}
