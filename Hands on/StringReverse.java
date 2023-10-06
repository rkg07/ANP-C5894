package String;

/*
write a java program to reverse each word in string 
*/

public class StringReverse 
{
	public static void main(String[] args) 
	{
		StringBuilder s = new StringBuilder();

        s.append("Hello, "); // Appending a string
        s.append("world!"); // Appending another string
        s.append("Good evening");
        s.reverse(); // Reversing the string
        System.out.println(s.toString());


	}

}