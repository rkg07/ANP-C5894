package Collection;

/*
 Queue Operations
 Write a Java program that demonstrates the usage of a Queue (LinkedList):
 a)Enqueue a series of elements.
 b)Dequeue elements from the Queue.
 c)Print the elements after each dequeue operation.
*/

import java.util.LinkedList;
import java.util.Queue;
public class QueueOperations 
{
	public static void main(String[] args)
	{
		//Creating Queue to store elements.
		Queue <String> q=new LinkedList<>();
		
		// Enqueue elements
		q.add("A");
		q.add("B");
		q.add("C");
		q.add("D");
		q.add("E");	
		
		//display the elements of the queue
		System.out.println("Elements in queue:" +q);
		
		// Dequeue elements
		while (!q.isEmpty())
		{
			//Removed and return the element of the queue
            System.out.println("Remove element:"+ q.remove());
            //Print the elements in the queue.
            System.out.println("Queue elements after dequeue:"+ q);
          
		}
	
	}
}
