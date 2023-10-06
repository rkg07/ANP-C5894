package String;

/*
 * How to remove a particular character from a String.
 */

public class String1 
{
	public static void main(String[] args)
	{
		String name = "Hello Prasanna, How are you?";
		
		System.out.println(charRemoveAt(name, 16));
	}
	
	public static String charRemoveAt(String str, int p)
	{
		return str.substring(0, p) + str.substring(p + 1);
		
	}  

}