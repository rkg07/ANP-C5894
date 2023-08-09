package Collection;

/*
 Stack Implementation
 Implement a stack using either an ArrayList or a LinkedList.
  Write a program that performs the following operations:
 a) Push elements onto the stack.
 b) Pop elements from the stack.
 c) Check whether the stack is empty.
 d) Display the elements in the stack.
*/

import java.util.Stack;
public class Stacks 
{

	public static void main(String[] args)
	{
		// Create a Stack to store strings
		Stack<Integer> s = new Stack<>();
		
		// Pushing elements onto the stack
	    s.push(10);
	    s.push(20);
	    s.push(30);
	    s.push(40);
	    s.push(50);
	    
	    // Popping elements from the stack
	    System.out.println("Popped element: " + s.pop());
	    System.out.println("Popped element: " + s.pop());
	    
	    // Check if the stack is empty
	    System.out.println("Is stack empty? " + s.isEmpty());
	      
	    //Displaying the contents of the stack
	    System.out.println("Elments in the stack are: " + s);
	      
	}

}
