package com.spring1.demo;

public class Rectangle implements Shape
{
	private String color;
		
	public void setColor(String color)
	{
		this.color = color;
	
	}
	
	@Override
	public void draw()
	{
		System.out.println("Drawing "+color+" Rectangle");

	}

}

