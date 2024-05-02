package com.spring1.demo;

//Spring Core- dependency Injection - IOC- SpringContainer --to remove the depedency 
//constructor way
//setter way 
//AOP -- Aspect Oriented Programming
//cross cutting concern 5 remove

public class Circle implements Shape
{
	private String color;
	
	public Circle()
	{
		color="black";
	}
	
	public Circle(String color)
	{
		super();
		this.color = color;
	}

	@Override
	public void draw() 
	{
		//comment
		//initilize value
		//input to value //  cross cutting concerns
		
		System.out.println("Drawing "+color+" Circle"); // bussniness logic
	
		//object null.
		//comment
		//initi

	}
	
}
