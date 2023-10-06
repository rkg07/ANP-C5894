package Collection;

public class NullPointerExc 
{
	public static void main(String[] args)
    {
        String a = null; // Initializing a reference variable with null
        
        try 
        {
            int length = a.length(); // This line will throw a NullPointerException
            System.out.println("Length of the text: " + length);
        } 
        catch (NullPointerException e)
        {
            System.out.println("An error occurred: " + e.getMessage());
        }
        
        System.out.println("Program continues...");
    }
}