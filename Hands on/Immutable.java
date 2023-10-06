package String;

/*
 Java Program to prove that strings are immutable in java
 */

public class Immutable 
{
	public static void main(String[] args)
    {
        String s1 = "Rutik";
 
        String s2 = "India";
 
        System.out.println(s1 == s2);      //Output : true
 
        s1 = s1 + "J2EE";
 
        System.out.println(s1 == s2);      //Output : false
        
    }
	
}