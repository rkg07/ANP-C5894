package Operator;

/*
 Create a Book class with the following attributes:
 title (String)
 author (String)
 isbn (String)
 year (int)
 
 Implement three constructors for the Book class:
 Default constructor that sets default values for title, author, isbn, and year.
 Constructor that takes title, author, and isbn as parameters 
 and sets the year to the current year (use java.time.Year).
 Constructor that takes all four attributes as parameters.
 */

import java.time.Year;
public class Book 
{
	//Fileds or attributes
	private String title;
	private String author;
	private String isbn;
	private static Year year;
	
	// Default constructor - without parameter
	public Book()
	{
		title ="400 Days ";
		author ="Chetan Bhagat ";
		isbn ="978-1-54-209408-5";
		year = Year.now();
				
	}
	
	//Constructor with title parameter
	public Book(String title)
	{
		this.title = title;
		author ="Tessa Bailey ";
		isbn = "978-0-06-304565-1";
		year = Year.now();
		
	}
	
	//Constructor with title and author parameters
	public Book(String title,String author)
	{
		this.title = title;
		this.author =author;
		this.isbn ="978-8-12-914184-2";
		year = Year.now();
		
	}
	
	//Constructor with title, author, isbn parameters
	public Book(String title, String author, String isbn)
	 {
	    this.title=title;
	    this.author=author;
	    this.isbn=isbn;
	    year = Year.now();
	    	
	  }

	

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getIsbn() {
		return isbn;
	}

	public static Year getYear() {
	    return year;


	}
	
class BookMain
{
	public static void main(String[] args)
	{
		//Creating object using different constructors
		Book Book1=new Book();
		Book Book2=new Book("It Happened One Summer "); // Constructor with name paramete
		Book Book3=new Book("The man-eating leopard of Rudraprayag ","Jim Corbett "); //Constructor with name and age parameters
		Book Book4=new Book("Life","Rutik Ghodekar", "978-0-07-354577-9");

	    // Getting information using getter methods
	    System.out.println("The Book is " + Book1.getTitle() + " wriiten by "  + Book1.getAuthor() + "  ISBN number: " + Book1.getIsbn() + " in "+ getYear());
	    System.out.println("The Book is " + Book2.getTitle() + " wriiten by "  + Book2.getAuthor() + "  ISBN number: " + Book2.getIsbn() + " in "+ getYear());
	    System.out.println("The Book is " + Book3.getTitle() + " wriiten by "  + Book3.getAuthor() + "  ISBN number: " + Book3.getIsbn() + " in "+ getYear());
	    System.out.println("The Book is " + Book4.getTitle() + " wriiten by "  + Book4.getAuthor() + "  ISBN number: " + Book4.getIsbn() + " in "+ getYear());
	}
		
}

}
